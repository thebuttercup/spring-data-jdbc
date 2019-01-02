/*
 * Copyright 2018-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.mapping.event;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.Test;

/**
 * Unit tests for {@link Identifier}
 *
 * @author Jens Schauder
 */
public class IdentifierTest {

	@SuppressWarnings("unchecked")
	@Test
	public void specifiedOffersTheIdentifierValue() {

		Identifier.Specified identifier = Identifier.of("x");

		assertThat(identifier.getValue()).isEqualTo("x");
		assertThat((Optional<Object>) identifier.getOptionalValue()).contains("x");
	}

	@Test
	public void indentifierOfNullHasEmptyValue() {

		Identifier identifier = Identifier.ofNullable(null);

		assertThat(identifier.getOptionalValue()).isEmpty();
	}

	@SuppressWarnings("unchecked")
	@Test
	public void indentifierOfXHasValueX() {

		Identifier identifier = Identifier.ofNullable("x");

		assertThat((Optional<Object>) identifier.getOptionalValue()).hasValue("x");
	}
}
