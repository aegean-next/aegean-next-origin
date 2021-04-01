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
import java.util.Date;

/**
 * PaymentLog
 *
 * @author RainyBlossom
 * @date 2021/3/31
 */
@Data
@Builder
@TableName("t_payment_log")
public class PaymentLog extends BaseModel {

    /** payment id **/
    @TableField("payment_id")
    private BigInteger paymentId;

    /** 支付类型 **/
    @TableField
    private Integer type;

    /**
     * 关键参数
     * 每次支付会存在一些关键的参数信息，比如回调的支付地址等
     * 请将这些信息通过 JSON 的形式存储起来，方便再次使用
     */
    @TableField
    private String param;

    /**
     * 请求参数
     */
    @TableField
    private String request;

    /** 返回参数 **/
    @TableField
    private String response;

    /** 支付有效期 **/
    @TableField
    private Date periodTime;

    /** 请求时间 **/
    @TableField("request_time")
    private Date requestTime;

    /** 响应时间 **/
    @TableField("response_time")
    private Date responseTime;
}
