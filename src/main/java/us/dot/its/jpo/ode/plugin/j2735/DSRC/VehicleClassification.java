/*==============================================================================
 *
 * This source file was generated by a tool.
 * Beware manual edits might be overwritten in future releases.
 * asn1jvm v1.0-SNAPSHOT
 *
 *------------------------------------------------------------------------------
 * Copyright 2024 USDOT
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *============================================================================*/

package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import us.dot.its.jpo.ode.plugin.j2735.itis.IncidentResponseEquipment;
import us.dot.its.jpo.ode.plugin.j2735.itis.ResponderGroupAffected;
import us.dot.its.jpo.ode.plugin.j2735.itis.VehicleGroupAffected;
import us.dot.its.jpo.ode.plugin.j2735.region.Reg_VehicleClassification;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class VehicleClassification extends Asn1Sequence {

	@Asn1Property(tag = 0, name = "keyType", optional = true)
	@JsonProperty("keyType")
	private BasicVehicleClass keyType;
	@Asn1Property(tag = 1, name = "role", optional = true)
	@JsonProperty("role")
	private BasicVehicleRole role;
	@Asn1Property(tag = 2, name = "iso3883", optional = true)
	@JsonProperty("iso3883")
	private Iso3833VehicleType iso3883;
	@Asn1Property(tag = 3, name = "hpmsType", optional = true)
	@JsonProperty("hpmsType")
	private VehicleType hpmsType;
	@Asn1Property(tag = 4, name = "vehicleType", optional = true)
	@JsonProperty("vehicleType")
	private VehicleGroupAffected vehicleType;
	@Asn1Property(tag = 5, name = "responseEquip", optional = true)
	@JsonProperty("responseEquip")
	private IncidentResponseEquipment responseEquip;
	@Asn1Property(tag = 6, name = "responderType", optional = true)
	@JsonProperty("responderType")
	private ResponderGroupAffected responderType;
	@Asn1Property(tag = 7, name = "fuelType", optional = true)
	@JsonProperty("fuelType")
	private FuelType fuelType;
	@Asn1Property(tag = 8, name = "regional", optional = true)
	@JsonProperty("regional")
	private SequenceOfRegional regional;

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_VehicleClassification> {
		SequenceOfRegional() {
			super(Reg_VehicleClassification.class, 1L, 4L);
		}
	}

	VehicleClassification() {
		super(true);
	}
}