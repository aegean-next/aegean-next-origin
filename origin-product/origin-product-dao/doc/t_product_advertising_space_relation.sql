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

create table t_product_advertising_space_relation
(
    id          bigint auto_increment
        primary key,
    type        int                                null comment '定位类型：0-Float浮动位(相对位置),1-Fix固定位(绝对位置)',
    location    int                                null comment '位置(适用于相对定位)',
    location_x  int                                null comment '横位置(适用于绝对定位)',
    location_y  int                                null comment '纵位置(适用于绝对定位)',
    page        int                                null comment '页码',
    create_time datetime default CURRENT_TIMESTAMP not null,
    update_time datetime default CURRENT_TIMESTAMP not null
);

