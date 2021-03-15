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

package tech.aegean.next.origin.product.model.catrgory;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.constant.CommonStatusEnum;
import tech.aegean.next.origin.base.model.BaseModel;

import java.math.BigInteger;

/**
 * 分类模型
 *
 * 分类是一个树，一个商品会存在一个默认分类和多个非默认分类
 *
 * @author RainyBlossom
 */
@Data
@Builder
@TableName("t_product_category")
public class Category extends BaseModel {

    /** 编码 **/
    @TableField
    private String code;

    /** 名称 **/
    @TableField
    private String name;

    /** 排序 **/
    @TableField
    private Integer sort;

    /** 类型 **/
    @TableField
    private Integer type;

    /**
     * 状态
     * @see CommonStatusEnum
     */
    @TableField
    private Integer status;

    /** 图片 **/
    @TableField
    private String image;

    /** 父 ID **/
    @TableField
    private BigInteger parent;
}
