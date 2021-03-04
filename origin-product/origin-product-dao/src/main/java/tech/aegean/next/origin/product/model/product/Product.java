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

package tech.aegean.next.origin.product.model.product;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.aegean.next.origin.base.model.BaseModel;

import java.util.Date;

/**
 * 商品扩展模型
 * 商品扩展模型独立且依赖于 SPU 和 SKU，包含了某些特定场景下（商品特性化、活动新玩法等）的信息，对于商品信息的扩展（如联名、定制等）
 * 在以往的开发过程中，往往会在商品的基础模型中不断增加字段，来快速满足需求，这样会导致商品表字段不断被迫增加，对业务造成压力。
 *
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_product_sku")
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product extends BaseModel {

    /** 关联的 SPU 编码 **/
    @TableField("spu_code")
    private String spuCode;

    /** 关联的 SKU 编码 **/
    @TableField("sku_code")
    private String skuCode;


}
