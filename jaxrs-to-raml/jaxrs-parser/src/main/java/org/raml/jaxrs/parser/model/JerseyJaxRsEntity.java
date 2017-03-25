/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
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
package org.raml.jaxrs.parser.model;

import com.google.common.base.Optional;
import org.glassfish.jersey.server.model.Parameter;
import org.raml.jaxrs.model.JaxRsEntity;

import java.lang.reflect.Type;

/**
 * Created by Jean-Philippe Belanger on 3/25/17. Just potential zeroes and ones
 */
public class JerseyJaxRsEntity implements JaxRsEntity {

  private final Type input;

  public JerseyJaxRsEntity(Type input) {

    this.input = input;
  }

  @Override
  public Type getType() {

    return input;
  }

  static JerseyJaxRsEntity create(Parameter input) {

    return new JerseyJaxRsEntity(input.getType());
  }

  static Optional<JaxRsEntity> create(Type input) {

    if (input == null) {
      return Optional.absent();
    } else {

      return Optional.<JaxRsEntity>of(new JerseyJaxRsEntity(input));
    }
  }

}
