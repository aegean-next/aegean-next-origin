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

create table t_member_base
(
    id     bigint auto_increment comment '主键',
    mobile varchar(100)  null comment '手机号',
    email  varchar(100)  null comment '邮箱',
    salt   varchar(255)  null comment '密码盐值',
    source int           null comment '注册来源',
    status int default 1 not null comment '状态',
    constraint t_member_base_email_uindex
        unique (email),
    constraint t_member_base_id_uindex
        unique (id),
    constraint t_member_base_mobile_uindex
        unique (mobile)
);

alter table t_member_base
    add primary key (id);





