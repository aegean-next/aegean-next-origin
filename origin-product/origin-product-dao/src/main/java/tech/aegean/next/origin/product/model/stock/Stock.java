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

package tech.aegean.next.origin.product.model.stock;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.util.Date;

/**
 * 库存模型
 * 基于 SKU 的分渠道库存统计模型
 *
 * @author RainyBlossom
 */
@Data
@Builder
@TableName("t_product_stock")
public class Stock extends BaseModel {

    // ----- ----- 基础信息 ----- -----

    /**
     * 渠道库存量
     * 单个 SKU 会存在多个渠道，如线上、VIP 专属、线下门店、第三方快闪店、预售等，
     * 在实际应用中往往需要针对不同渠道的库存进行售卖，总库存的使用意义不高，且在不同场景下的总库存含义并不同。
     */
    private Integer quantity;

    /**
     * 保留库存量
     * 在业务应用中：
     * 1. 存在为 VIP 客户预留某个库存的专属服务，由客服为其下单或作为专属库存提供给某个特定的账户。
     * 2. 分批定量释放部分库存，如 12306 抢票就不会一次释放，需要使用保留库存为业务提供支持。
     */
    private Integer reserved;

    /**
     * 锁定库存量
     * 因顾客提交订单或其他业务场景，造成的库存锁定数量，这部分库存往往不需要即时同步到仓储系统，而会在业务端进行实时操作（如顾客取消、订单超时会实时回滚）
     */
    private Integer locked;

    /**
     * 渠道类型
     * @See InventorySourceEnum
     */
    private Integer source;

    // ----- ----- 时间信息 ----- -----

    /**
     * 库存基准
     * 用于核算库存版本，此时间是全量库存同步时才会修改的
     */
    private Date baseline;

    /**
     * 库存版本
     * 用于记录实时库存变更时间，此时间是增量库存同步时才会修改的
     */
    private Date version;

    // ----- ----- 关联信息 ----- -----

    /** 关联的 SPU ID **/
    @TableField("sku_id")
    private Long skuId;

    /** 关联的 SPU 编码 **/
    @TableField("sku_code")
    private Long skuCode;

}
