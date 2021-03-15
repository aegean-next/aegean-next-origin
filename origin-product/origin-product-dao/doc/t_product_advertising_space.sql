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

create table t_product_advertising_space
(
    id             bigint auto_increment
        primary key,
    name           varchar(100)                         not null comment '广告位名称',
    code           varchar(100)                         not null comment '广告位编码',
    status         int                                  not null comment '状态:0-逻辑删除,1-有效,2-失效',
    image          varchar(255)                         null comment '广告位图片地址',
    target         varchar(255)                         null comment '目标跳转地址',
    new_tab        tinyint(1) default 0                 null comment '跳转是否新开页面',
    size           int        default 1                 null comment '大小（占用几个广告位）',
    effective_time datetime                             not null comment '生效时间',
    expired_time   datetime                             not null comment '失效时间',
    create_time    datetime   default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time    datetime   default CURRENT_TIMESTAMP not null comment '更新时间'
);



