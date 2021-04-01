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

package tech.aegean.next.origin.promotion.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.util.Date;

/**
 * PromotionActivity
 *
 * @author RainyBlossom
 * @date 2021/3/31
 */
@Data
@Builder
@TableName("t_promotion_acticity")
public class PromotionActivity extends BaseModel {

    /** 促销活动编码 **/
    @TableField
    private String code;

    /** 促销活动名称 **/
    @TableField
    private String name;

    /** 促销类型 **/
    @TableField
    private String type;

    /** 是否为预置促销 **/
    @TableField
    private Boolean preset;

    /** 渠道 **/
    @TableField
    private Integer source;

    /** 优先级 **/
    @TableField
    private Integer sort;

    /** 状态 **/
    @TableField
    private Integer status;

    /** 生效时间 **/
    @TableField("effective_time")
    private Date effectiveTime;

    /** 失效时间 **/
    @TableField("expired_time")
    private Date expiredTime;
}
