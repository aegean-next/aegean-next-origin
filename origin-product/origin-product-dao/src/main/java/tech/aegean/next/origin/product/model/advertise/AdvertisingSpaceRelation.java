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

package tech.aegean.next.origin.product.model.advertise;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

/**
 * 广告位关系
 *
 * 在 PLP 中除了展示常规商品外，还包括某些广告展示位置，广告位通常会占用若干个商品位置，并指定展示位置。
 *
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_product_advertising_space_relation")
public class AdvertisingSpaceRelation extends BaseModel {

    /**
     * 定位类型
     * 0 - Float 浮动位（相对位置）
     * 1 - Fix 固定位（绝对位置）
     */
    @TableField
    private Integer type;

    /** 位置（适用于相对定位） **/
    @TableField
    private Integer location;

    /** 横位置（适用于绝对定位） **/
    @TableField
    private Integer locationX;

    /** 纵位置（适用于绝对定位） **/
    @TableField
    private Integer locationY;

    /** 页码 **/
    @TableField
    private Integer page;

}
