package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_GenericLane;

/**
 * 
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericLane extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private LaneID laneID;
	@Asn1Property(tag = 1, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 2, optional = true)
	private ApproachID ingressApproach;
	@Asn1Property(tag = 3, optional = true)
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

	public LaneID getLaneID() {
		return laneID;
	}

	public void setLaneID(LaneID laneID) {
		this.laneID = laneID;
	}

	public DescriptiveName getName() {
		return name;
	}

	public void setName(DescriptiveName name) {
		this.name = name;
	}

	public ApproachID getIngressApproach() {
		return ingressApproach;
	}

	public void setIngressApproach(ApproachID ingressApproach) {
		this.ingressApproach = ingressApproach;
	}

	public ApproachID getEgressApproach() {
		return egressApproach;
	}

	public void setEgressApproach(ApproachID egressApproach) {
		this.egressApproach = egressApproach;
	}

	public LaneAttributes getLaneAttributes() {
		return laneAttributes;
	}

	public void setLaneAttributes(LaneAttributes laneAttributes) {
		this.laneAttributes = laneAttributes;
	}

	public AllowedManeuvers getManeuvers() {
		return maneuvers;
	}

	public void setManeuvers(AllowedManeuvers maneuvers) {
		this.maneuvers = maneuvers;
	}

	public NodeListXY getNodeList() {
		return nodeList;
	}

	public void setNodeList(NodeListXY nodeList) {
		this.nodeList = nodeList;
	}

	public ConnectsToList getConnectsTo() {
		return connectsTo;
	}

	public void setConnectsTo(ConnectsToList connectsTo) {
		this.connectsTo = connectsTo;
	}

	public OverlayLaneList getOverlays() {
		return overlays;
	}

	public void setOverlays(OverlayLaneList overlays) {
		this.overlays = overlays;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_GenericLane> {
		SequenceOfRegional() {
			super(Reg_GenericLane.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	GenericLane() {
		super(true);
	}
}