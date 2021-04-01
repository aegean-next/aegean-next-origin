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

import java.math.BigInteger;

/**
 * PaymentStatusChangeLog
 *
 * @author RainyBlossom
 * @date 2021/3/31
 */
@Data
@Builder
@TableName("t_payment_status_log")
public class PaymentStatusLog extends BaseModel {

    /** 支付单 ID **/
    @TableField("payment_id")
    private BigInteger paymentId;

    /** 修改前支付类型 **/
    @TableField("before_type")
    private Integer beforeType;

    /** 修改后支付类型 **/
    @TableField("after_type")
    private Integer afterType;
}
