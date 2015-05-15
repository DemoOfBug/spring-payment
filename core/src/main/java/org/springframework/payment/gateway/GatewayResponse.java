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

import java.util.Collections;
import java.util.Map;

/**
 * Represents the responsen from a payment gateway formatted and structured in a payment
 * gateway specific manner. 
 * 
 * @author Rossen Stoyanchev
 */
public class GatewayResponse {

	private Map<String, String> responseFields;

	public GatewayResponse(Map<String, String> responseFields) {
		this.responseFields = responseFields;
	}

	/**
	 * @return A Map with name-value pairs.
	 */
	public Map<String, String> getResponseFields() {
		return Collections.unmodifiableMap(responseFields);
	}

}
