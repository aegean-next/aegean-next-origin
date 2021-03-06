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

package tech.aegean.next.origin.product.model.tag;

import tech.aegean.next.origin.base.model.BaseModel;

/**
 * 标签模型 (基于 SPU 或 SKU)
 *
 * 一个商品会拥有多个标签，并且在不同的场景下有不同的展示优先级，在以往的业务场景中，这些展示逻辑经常写死在代码中，很不友好。
 * 实际上，应该通过对应的场景值以及优先级来动态判断展示规则，由业务人员进行配置。
 *
 * @author RainyBlossom
 */
public class Tag extends BaseModel {
}
