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

package tech.aegean.next.origin.member.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.model.BaseModel;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户授权相关
 */
@Data
@Builder
@TableName("t_member_authorization")
public class MemberAuthorization extends BaseModel {

    /**
     * 短信订阅
     */
    @TableField
    private Boolean smsSubscriptions;

    /**
     * 邮件订阅
     */
    @TableField
    private Boolean emailSubscriptions;

    /**
     * 微信订阅
     */
    @TableField
    private Boolean wechatSubscriptions;

    /**
     * Member Id
     */
    @TableField
    private BigInteger memberId;

}
