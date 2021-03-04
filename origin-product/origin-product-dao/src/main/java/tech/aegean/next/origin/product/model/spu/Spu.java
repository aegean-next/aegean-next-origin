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

package tech.aegean.next.origin.product.model.spu;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.math.BigInteger;

/**
 * Standard Product Unit（标准化产品单元）
 * SPU 是商品信息聚合的最小单位，是一组可复用、易检索的标准化信息的集合，该集合描述了一个产品的特性。
 * SPU 包含的都是商品的一般属性（描述其是什么属性，不包含还能卖多少的属性）
 *
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_product_spu")
public class Spu extends BaseModel {

    /**
     * 商品编码
     */
    @TableField
    private String code;

    /**
     * 款号
     */
    @TableField
    private String style;

    /**
     * 商品类型
     */
    @TableField
    private Integer type;


}
