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

package tech.aegean.next.origin.member.handler.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.aegean.next.origin.base.service.redisson.RedisService;
import tech.aegean.next.origin.member.entity.request.MemberLoginRequest;
import tech.aegean.next.origin.member.entity.response.MemberLoginResponse;
import tech.aegean.next.origin.member.mapper.MemberMapper;
import tech.aegean.next.origin.member.model.Member;

import javax.servlet.http.HttpServletRequest;

@Component
public class MemberLoginOfficialMallHandler extends MemberLoginAbstarctHandler{

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberLoginResponse doLogin(HttpServletRequest request, MemberLoginRequest memberLogin) {
        // TODO【业务缓冲】基于缓存检查用户信息
//        memberMapper
        return null;
    }
}
