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

package tech.aegean.next.origin.base.service.redisson;

import org.redisson.api.RMap;

/**
 * 常见的 Redis 方法封装
 * 复杂业务请直接使用 RedissonFactory#getInstance() 方法获取 Redisson 实例
 */
public interface RedisService {

    /**
     * 计算 Redis Key
     * @param prefix
     * @param keyword
     */
    String calculateKey(String prefix, String keyword);

    /**
     * 存储对象
     * 使用通用对象桶（Object Bucket）
     * @param key
     * @param value
     */
    void setObject(String key, Object value);

    /**
     * 存储对象
     * 使用通用对象桶（Object Bucket）
     * @param key
     * @param value
     * @param time 单位：秒
     */
    void setObject(String key, Object value, Integer time);

    /**
     * 存储 Map
     * 使用分布式集合 - 映射 Map
     * @param key
     * @param value
     */
    void setMap(String key, RMap<String, Object> value);
}
