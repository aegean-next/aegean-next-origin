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

package tech.aegean.next.origin.payment.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * PaymentInfo
 *
 * @author RainyBlossom
 * @date 2021/3/31
 */
@Data
@Builder
@TableName("t_payment_stage_line")
public class PaymentStageLine extends BaseModel {

    /** 分期 ID */
    @TableField("stage_id")
    private BigInteger stageId;

    /** 当前期数 **/
    @TableField("current_period")
    private Integer currentPeriod;

    /** 应还金额 **/
    @TableField
    private BigDecimal amount;

    /** 本金 **/
    @TableField
    private BigDecimal capital;

   /** 利息 *. */
    @TableField
    private BigDecimal interest;
}
