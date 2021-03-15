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

package tech.aegean.next.origin.product.model.comment;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.math.BigInteger;

/**
 * 商品评价（基于 SPU 或 Product）
 * 商品和评价是一对多关系
 *
 * @author RainyBlossom
 */
@Data
@Builder
@TableName("t_product_comment")
public class Comment extends BaseModel {

    /** SPU ID **/
    @TableField("spu_id")
    private BigInteger spuId;

    /** SPU 编码 **/
    @TableField("spu_code")
    private String spuCode;

    /** Order ID **/
    @TableField("order_id")
    private BigInteger orderId;

    /** Order 编码 **/
    @TableField("order_code")
    private String orderCode;

    /** Member ID **/
    @TableField("member_id")
    private BigInteger memberId;

    /** 评价内容 **/
    @TableField
    private String comment;

    /** 评价级别 **/
    @TableField
    private Integer rank;

    /** 展示优先级 **/
    @TableField
    private Integer sort;
}
