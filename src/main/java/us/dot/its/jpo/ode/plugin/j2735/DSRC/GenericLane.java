package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.j2735.REGION.Reg_GenericLane;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class GenericLane extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = LaneID.LaneIDDeserializer.class)
	private LaneID laneID;
	@Asn1Property(tag = 1, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = ApproachID.ApproachIDDeserializer.class)
	private ApproachID ingressApproach;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = ApproachID.ApproachIDDeserializer.class)
	private ApproachID egressApproach;
	@Asn1Property(tag = 4)
	private LaneAttributes laneAttributes;
	@Asn1Property(tag = 5, optional = true)
	private AllowedManeuvers maneuvers;
	@Asn1Property(tag = 6)
	private NodeListXY nodeList;
	@Asn1Property(tag = 7, optional = true)
	@JacksonXmlElementWrapper(localName = "connectsTo")
	@JacksonXmlProperty(localName = "Connection")
	private ConnectsToList connectsTo;
	@Asn1Property(tag = 8, optional = true)
	@JacksonXmlElementWrapper(localName = "overlays")
	@JacksonXmlProperty(localName = "LaneID")
	private OverlayLaneList overlays;
	@Asn1Property(tag = 9, optional = true)
	private SequenceOfRegional regional;

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_GenericLane> {
		SequenceOfRegional() {
			super(Reg_GenericLane.class, 1L, 4L);
		}
	}

	GenericLane() {
		super(true);
	}
}