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

/**
 * 会员实体类
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_member_base")
public class Member extends BaseModel {

    /**
     * 手机号
     */
    @TableField
    private String mobile;

    /**
     * 邮箱
     */
    @TableField
    private String email;

    /**
     * 用户密码使用盐值校验
     */
    @TableField
    private String salt;

    /**
     * 注册来源
     * 100 - 官网自注册
     * 101 - 官网推荐注册
     * ... 待定
     */
    @TableField
    private Integer source;

    /**
     * 状态
     * 0 - 注销
     * 1 - 启用
     * 2 - 冻结
     */
    @TableField
    private Integer status;



}
