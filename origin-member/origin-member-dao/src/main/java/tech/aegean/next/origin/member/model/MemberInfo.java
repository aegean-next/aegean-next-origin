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

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * 会员信息实体类
 * @author rainyblossom
 */
@Data
@Builder
@TableName("t_member_info")
public class MemberInfo {

    /**
     * PK
     */
    private BigInteger id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 称谓
     */
    private String appellation;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 生日
     */
    private Date birthday;

}
