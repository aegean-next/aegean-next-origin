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
import tech.aegean.next.origin.base.constant.CommonStatusEnum;
import tech.aegean.next.origin.base.model.BaseModel;

import java.util.Date;

/**
 * 广告位
 *
 * 在 PLP 中除了展示常规商品外，还包括某些广告展示位置，广告位通常会占用若干个商品位置，并指定展示位置。
 *
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_product_advertising_space")
public class AdvertisingSpace extends BaseModel {

    /** 名称 **/
    @TableField
    private String name;

    /** 编码 **/
    @TableField
    private String code;

    /**
     * 状态
     * @see CommonStatusEnum
     */
    @TableField
    private String status;

    /** 图片 **/
    @TableField
    private String image;

    /** 目标跳转地址 **/
    @TableField
    private String target;

    /** 跳转是否新开页面 **/
    @TableField
    private Boolean newTab;

    /** 大小（占用几个广告位）**/
    @TableField
    private Integer size;

    /** 生效时间 **/
    @TableField
    private Date effectiveTime;

    /** 失效时间 **/
    @TableField
    private Date expiredTime;
}
