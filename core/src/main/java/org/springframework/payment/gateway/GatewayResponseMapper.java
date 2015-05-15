/*
 * Copyright 2004-2010 the original author or authors.
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

package org.springframework.payment.gateway;

import java.text.MessageFormat;

import org.springframework.core.convert.converter.Converter;
import org.springframework.mapping.Mapper;
import org.springframework.mapping.support.MappingMapperBuilder;

/**
 * A base class for all {@link Mapper} types that map from a {@link GatewayResponse} to 
 * some target type. 
 * 
 * @author Rossen Stoyanchev
 */
public abstract class GatewayResponseMapper<T> extends MappingMapperBuilder<GatewayResponse, T> {

	public GatewayResponseMapper(Class<T> targetType) {
		super(GatewayResponse.class, targetType);
		setSourceFieldDecorator(new Converter<String, String>() {
			public String convert(String source) {
				return MessageFormat.format("responseFields[''{0}'']", source);
			}
		});
		setAutoMappingEnabled(false);
	}

}
