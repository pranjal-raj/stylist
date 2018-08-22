/*
 * Copyright (c) 2018. Commit 451
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.commit451.uresourcespoet

/**
 * The various resource types
 *
 * @see [https://developer.android.com/guide/topics/resources/available-resources.html](https://developer.android.com/guide/topics/resources/available-resources.html)
 */
enum class Type(private val xmlName: String) {

  ATTR("attr"),
  BOOL("bool"),
  COLOR("color"),
  DRAWABLE("drawable"),
  DIMENSION("dimen"),
  ID("item"),
  INTEGER("integer"),
  INTEGER_ARRAY("integer-array"),
  FONT("font"),
  LAYOUT("layout"),
  MENU("menu"),
  PLURALS("plurals"),
  STRING("string"),
  STRING_ARRAY("string-array"),
  STYLE("style"),
  TYPED_ARRAY("array");

  override fun toString() = xmlName
}
