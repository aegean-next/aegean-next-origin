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

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户等级
 */
@Data
@Builder
@TableName("t_member_rank")
public class MemberRank {

    /**
     * PK
     */
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    /**
     * 用户等级
     */
    @TableField
    private Integer rank;

    /**
     * 用户积分
     * 场景：常见的积分使用可以兑换礼品，或者抵扣订单金额
     */
    @TableField
    private Integer point;

    /**
     * 用户经验值
     *
     * 概述：在某些互动场景下，经验值可以兑换积分
     * 场景：由于电商业务的复杂玩法，某些业务可能会通过高数值的积分奖励和小数值的兑换比例来激励用户互动，这就需要一个中介字段来进行积分兑换。
     *
     */
    @TableField
    private Integer experience;

    /**
     * 创建时间
     */
    @TableField
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField
    private Date updateTime;



}
