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

package tech.aegean.next.origin.product.constant.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 商品类型枚举
 * @author RainyBlossom
 */
@AllArgsConstructor
public enum ProductStatusEnum {

    /**
     * 100 - 新建
     * 101 - 在售
     * 102 - 下架
     * 200 - 移除（因历史订单可能存在关联关系，不允许物理删除）
     *
     */
    PRODUCT_STATUS_NEW(100),
    PRODUCT_STATUS_ON(101),
    PRODUCT_STATUS_OFF(102),
    PRODUCT_STATUS_REMOVE(200)

    ;

    @Setter
    @Getter
    private Integer value;
}
