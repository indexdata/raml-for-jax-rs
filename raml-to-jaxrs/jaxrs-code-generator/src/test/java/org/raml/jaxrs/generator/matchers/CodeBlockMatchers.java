/*
 * Copyright 2013-2018 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.generator.matchers;

import com.squareup.javapoet.CodeBlock;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

/**
 * Created by Jean-Philippe Belanger on 3/4/17. Just potential zeroes and ones
 */
public class CodeBlockMatchers {


  public static Matcher<CodeBlock> codeBlockContents(Matcher<? super String> codeBlock) {

    return new FeatureMatcher<CodeBlock, String>(codeBlock, "contents", "contents") {

      @Override
      protected String featureValueOf(CodeBlock codeBlock) {
        return codeBlock.toString();
      }
    };
  }
}
