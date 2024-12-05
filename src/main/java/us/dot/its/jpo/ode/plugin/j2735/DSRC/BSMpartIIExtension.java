package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import us.dot.its.jpo.ode.plugin.annotations.Asn1ParameterizedTypes;
import us.dot.its.jpo.ode.plugin.annotations.Asn1ParameterizedTypes.IdType;

/**
 * 
 *******************************************************************************
 *
 * This source file was generated by a tool. Beware manual edits might be
 * overwritten in future releases. asn1jvm v1.0-SNAPSHOT
 *
 *******************************************************************************
 * Copyright 2024 USDOT
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "partII_Id")
@JsonSubTypes({@JsonSubTypes.Type(value = VehicleSafetyExtensionsBSMpartIIExtension.class, name = "0"),
		@JsonSubTypes.Type(value = SpecialVehicleExtensionsBSMpartIIExtension.class, name = "1"),
		@JsonSubTypes.Type(value = SupplementalVehicleExtensionsBSMpartIIExtension.class, name = "2")})
@Asn1ParameterizedTypes(idProperty = "partII_Id", idType = IdType.INTEGER, valueProperty = "partII_Value", value = {
		@Asn1ParameterizedTypes.Type(value = VehicleSafetyExtensionsBSMpartIIExtension.class, intId = 0),
		@Asn1ParameterizedTypes.Type(value = SpecialVehicleExtensionsBSMpartIIExtension.class, intId = 1),
		@Asn1ParameterizedTypes.Type(value = SupplementalVehicleExtensionsBSMpartIIExtension.class, intId = 2)})
abstract public class BSMpartIIExtension<TValue> extends PartIIcontent<TValue> {

	public BSMpartIIExtension(int id, String name) {
		super(id, name);
	}
}