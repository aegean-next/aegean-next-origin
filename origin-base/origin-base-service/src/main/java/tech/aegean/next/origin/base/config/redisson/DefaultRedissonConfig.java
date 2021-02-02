/*
 * Copyright (c) 2021. Aegean Next OpenSource FrameWork
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 * ----- ----- ----- ----- -----
 *
 * Visit the project homepage for more information at https://next.aegean.tech,
 * Or see the code warehouse at https://github.com/aegean-next, https://gitee.com/aegean-next.
 */

package tech.aegean.next.origin.base.config.redisson;

import cn.hutool.core.lang.Validator;
import lombok.Getter;
import lombok.Setter;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tech.aegean.next.origin.base.constant.RedissonModeEnum;

@Getter
@Setter
@Component
public class DefaultRedissonConfig implements RedissonConfig {

    /**
     * Redisson 模式配置（必填），包括：
     * 1. MS - 主从模式
     * 2. Cluster - 集群模式
     * 3. Single - 单例模式
     * 4. Sentinel - 哨兵模式
     */
    @Value("${common.redis.mode}")
    private String mode;

    /**
     * 集群状态扫描间隔时间，单位是毫秒
     */
    @Value("${common.redis.scan.interval")
    private Integer scanInterval;

    /** 主从模式：主节点（可选） **/
    @Value("${common.redis.node.ms.master.url:}")
    private String msMasterNodeUrl;

    /** 主从模式：从节点列表（可选） **/
    @Value("${common.redis.node.ms.slave.urls:}")
    private String msSlaveNodeUrls;

    /** 集群模式：集群列表（可选） **/
    @Value("${common.redis.node.cluster.urls:}")
    private String clusterNodeUrls;

    /** 哨兵模式：主节点名（可选） **/
    @Value("${common.redis.node.sentinel.name:}")
    private String sentinelNodeName;

    /** 哨兵模式：节点列表（可选） **/
    @Value("${common.redis.node.sentinel.urls:}")
    private String sentinelNodeUrls;

    /** 单机模式：节点（可选） **/
    @Value("${common.redis.node.single.url:}")
    private String singleNodeUrl;

    private Config config;

    @Override
    public Config getConfig(){
        if (Validator.isNotNull(config)){
            return config;
        }
        switch(RedissonModeEnum.getConfig(mode)){
            case REDISSON_MODE_MS:
                config.useMasterSlaveServers().setMasterAddress(msMasterNodeUrl).addSlaveAddress(msSlaveNodeUrls);
                break;
            case REDISSON_MODE_CLUSTER:
                config.useClusterServers().setScanInterval(scanInterval).addNodeAddress(clusterNodeUrls);
                break;
            case REDISSON_MODE_SENTINEL:
                config.useSentinelServers().setMasterName(sentinelNodeName).addSentinelAddress(sentinelNodeUrls);
                break;
            case REDISSON_MODE_SINGLE:
                config.useSingleServer().setAddress(singleNodeUrl);
                break;
        }
        return config;
    }

    @Override
    public void reset(){
        config = null;
    }
}
