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

package tech.aegean.next.origin.product.model.property;

import tech.aegean.next.origin.base.model.BaseModel;

/**
 * 属性模型（基于 SPU 或 SKU）
 *
 * 属性分为一般属性（与库存无关的属性）和销售属性（与库存变更相关的属性），且属性存在下属的属性值、属性值组等概念。
 * 一个商品会关联多个属性，并基于一般属性生成商品的 SPU，基于销售属性生成可售卖的 SKU。
 * 属性是基于全局启用的，当启用了一个属性信息会应用于所有的商品
 *
 * @author RainyBlossom
 */
public class Property extends BaseModel {
}
