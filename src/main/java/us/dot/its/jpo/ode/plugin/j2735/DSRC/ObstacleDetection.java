package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.j2735.ITIS.ITIScodes;
import us.dot.its.jpo.ode.plugin.j2735.ITIS.GenericLocations;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ObstacleDetection extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = ObstacleDistance.ObstacleDistanceDeserializer.class)
	private ObstacleDistance obDist;
	@Asn1Property(tag = 1)
	private ObstacleDirection obDirect;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = ITIScodes.ITIScodesDeserializer.class)
	private ITIScodes description;
	@Asn1Property(tag = 3, optional = true)
	private GenericLocations locationDetails;
	@Asn1Property(tag = 4)
	private DDateTime dateTime;
	@Asn1Property(tag = 5, optional = true)
	private VerticalAccelerationThreshold vertEvent;

	ObstacleDetection() {
		super(true);
	}
}