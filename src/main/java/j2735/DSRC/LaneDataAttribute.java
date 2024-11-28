package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1SequenceOf;
import asn2pojo.runtime.types.Asn1Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_LaneDataAttribute;

import java.util.List;
import java.util.Optional;

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
public class LaneDataAttribute extends Asn1Choice {

	@Asn1Property(tag = 0)
	private DeltaAngle pathEndPointAngle;
	@Asn1Property(tag = 1)
	private RoadwayCrownAngle laneCrownPointCenter;
	@Asn1Property(tag = 2)
	private RoadwayCrownAngle laneCrownPointLeft;
	@Asn1Property(tag = 3)
	private RoadwayCrownAngle laneCrownPointRight;
	@Asn1Property(tag = 4)
	private MergeDivergeNodeAngle laneAngle;
	@Asn1Property(tag = 5)
	@JacksonXmlElementWrapper(localName = "speedLimits")
	@JacksonXmlProperty(localName = "RegulatorySpeedLimit")
	private SpeedLimitList speedLimits;
	@Asn1Property(tag = 6)
	private SequenceOfRegional regional;

	LaneDataAttribute() {
		super(true);
	}

	public DeltaAngle getPathEndPointAngle() {
		return pathEndPointAngle;
	}

	public void setPathEndPointAngle(DeltaAngle pathEndPointAngle) {
		this.pathEndPointAngle = pathEndPointAngle;
	}

	public RoadwayCrownAngle getLaneCrownPointCenter() {
		return laneCrownPointCenter;
	}

	public void setLaneCrownPointCenter(RoadwayCrownAngle laneCrownPointCenter) {
		this.laneCrownPointCenter = laneCrownPointCenter;
	}

	public RoadwayCrownAngle getLaneCrownPointLeft() {
		return laneCrownPointLeft;
	}

	public void setLaneCrownPointLeft(RoadwayCrownAngle laneCrownPointLeft) {
		this.laneCrownPointLeft = laneCrownPointLeft;
	}

	public RoadwayCrownAngle getLaneCrownPointRight() {
		return laneCrownPointRight;
	}

	public void setLaneCrownPointRight(RoadwayCrownAngle laneCrownPointRight) {
		this.laneCrownPointRight = laneCrownPointRight;
	}

	public MergeDivergeNodeAngle getLaneAngle() {
		return laneAngle;
	}

	public void setLaneAngle(MergeDivergeNodeAngle laneAngle) {
		this.laneAngle = laneAngle;
	}

	public SpeedLimitList getSpeedLimits() {
		return speedLimits;
	}

	public void setSpeedLimits(SpeedLimitList speedLimits) {
		this.speedLimits = speedLimits;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_LaneDataAttribute> {
		SequenceOfRegional() {
			super(Reg_LaneDataAttribute.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	@Override
	protected List<Optional<Asn1Type>> listTypes() {
		return null;
	}
}