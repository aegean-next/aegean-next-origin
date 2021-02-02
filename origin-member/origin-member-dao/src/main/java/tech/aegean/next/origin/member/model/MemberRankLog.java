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
 * 用户等级变更记录
 * 因消费、门店场景等造成经验值、积分、等级的变更记录
 */
@Data
@Builder
@TableName("t_member_rank_log")
public class MemberRankLog {

    /**
     * PK
     */
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    // ----- ----- 变更内容 ----- -----

    /**
     * 变更前等级
     */
    @TableField
    private Integer rankBefore;

    /**
     * 变更后等级
     */
    @TableField
    private Integer rankAfter;

    /**
     * 变更前积分
     */
    @TableField
    private Integer pointBefore;

    /**
     * 变更后积分
     */
    @TableField
    private Integer pointAfter;

    /**
     * 变更前积分
     */
    @TableField
    private Integer experienceBefore;

    /**
     * 变更后积分
     */
    @TableField
    private Integer experienceAfter;

    // ----- ----- 扩展内容 ----- -----

    /**
     * Member Id
     */
    @TableField
    private BigInteger memberId;

    /**
     * 类型
     * 100 - 减少
     * 200 - 增加
     */
    @TableField
    private Integer type;

    /**
     * 来源
     * 100 - 自动变更
     * 200 - 客服变更
     * 300 - 门店变更
     */
    @TableField
    private Integer source;

    /**
     * 操作者 Id
     */
    @TableField
    private BigInteger handlersId;

    /**
     * 操作者 姓名
     */
    @TableField
    private BigInteger handlersName;

    /**
     * 创建时间
     */
    @TableField
    private Date createTime;

    /**
     * 生效时间
     */
    @TableField
    private Date effectiveTime;
}
