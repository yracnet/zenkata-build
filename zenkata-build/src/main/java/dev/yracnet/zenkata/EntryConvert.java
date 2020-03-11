/**
 * Copyright © 2020 ${owner} (${email})
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.yracnet.zenkata;

import dev.yracnet.zenkata.impl.EntryConvertImpl;

/**
 *
 * @author Willyams Yujra
 */
public interface EntryConvert {
	public static final EntryConvert NONE = new EntryConvertImpl();
	public boolean test(EntryItem o);

	public Object apply(EntryItem o);
}
