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
 * Payment
 *
 * @author RainyBlossom
 * @date 2021/3/31
 */
@Data
@Builder
@TableName("t_payment_base")
public class Payment extends BaseModel {

    /** 支付流水号 **/
    @TableField("code")
    private String code;

    /** 第三方支付流水 **/
    @TableField("transaction_no")
    private String transactionNo;

    /**
     * 支付类型
     * 100 - 微信 JSAPI
     * 101 - 微信 APP
     * 102 - 微信 Native
     * 103 - 微信 付款码
     * 104 - 微信 H5
     * 105 - 微信 小程序
     * 106 - 微信 刷脸支付
     */
    @TableField
    private Integer type;

    /**
     * 支付状态
     * 100 - 创建失败
     * 101 - 创建成功
     * 200 - 回调验证失败
     * 201 - 回调验证成功
     * 300 - 订单自动取消
     * 301 - 顾客主动取消
     * 500 - 异常拦截
     */
    @TableField
    private Integer status;

    /** 是否为游客单 **/
    @TableField
    private Boolean visitor;

    /** 订单实付金额 **/
    @TableField
    private BigDecimal amount;

    /** 收件人手机号 **/
    @TableField
    private String mobile;

    /** 订单编码 **/
    @TableField("order_code")
    private String orderCode;

    /** 订单 ID **/
    @TableField("order_id")
    private BigInteger orderId;

    /** 支付成功时间 **/
    @TableField("pay_time")
    private String payTime;
}

