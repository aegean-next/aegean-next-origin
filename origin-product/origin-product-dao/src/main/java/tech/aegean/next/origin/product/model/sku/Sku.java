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

package tech.aegean.next.origin.product.model.sku;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

/**
 * Stock Keeping Unit（库存保有单元）
 * SKU SKU是物理上不可分割的最小存货单元，库存进出计量的单位
 * SKU 包含的都是商品的销售属性（受库存影响的属性），如：颜色、尺码、型号等。
 *
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_product_sku")
public class Sku extends BaseModel {

    // ----- ----- 基础信息 ----- -----

    /** 优先级 **/
    private Integer sort;

    /** 状态 **/
    private Integer status;

    /** 单位名 **/
    private String unit;

    // ----- ----- 编码信息 ----- -----

    /**
     * SKU 内部编码
     * 服饰类一般以款号 + 色号来定义 SKU 编码
     */
    @TableField
    private String code;

    /**
     * EAN 通用商品条形码
     * EAN-13条码为全球通用的商品条码，由13位数字组成的条形码：1-3位对应国家代码（如中国是690-699），4-7位代表厂商代码，由国家分配，8-12位代表产品代码，由厂商自定义设置，第13位是校验位。
     */
    private String barCode;

    /**
     * UPC 商品条形码
     * UPC-A条码是美国均匀码理事会制定的一种商品条码，主要在美国及加拿大使用，支持的字符集为0-9数字，只能表示12位数字（1位系统符，5位制造商代码，5位产品代码，1位校验码）
     */
    private String upcCode;

    // ----- ----- 价格信息 ----- -----

    /**
     *  销售价
     *  一般指实际销售价格
     */
    private Integer salesPrice;

    /** 吊牌价 **/
    private Integer tagPrice;


    // ----- ----- 关联信息 ----- -----

    /** 关联的 SPU ID **/
    @TableField("spu_id")
    private Long spuId;

    /** 关联的 SPU 编码 **/
    @TableField("spu_code")
    private Long spuCode;

}
