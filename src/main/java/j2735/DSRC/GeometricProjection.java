package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.REGION.Reg_GeometricProjection;

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
public class GeometricProjection extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private HeadingSlice direction;
	@Asn1Property(tag = 1, optional = true)
	private Extent extent;
	@Asn1Property(tag = 2, optional = true)
	private LaneWidth laneWidth;
	@Asn1Property(tag = 3)
	private Circle circle;
	@Asn1Property(tag = 4, optional = true)
	private SequenceOfRegional regional;

	public HeadingSlice getDirection() {
		return direction;
	}

	public void setDirection(HeadingSlice direction) {
		this.direction = direction;
	}

	public Extent getExtent() {
		return extent;
	}

	public void setExtent(Extent extent) {
		this.extent = extent;
	}

	public LaneWidth getLaneWidth() {
		return laneWidth;
	}

	public void setLaneWidth(LaneWidth laneWidth) {
		this.laneWidth = laneWidth;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_GeometricProjection> {
		SequenceOfRegional() {
			super(Reg_GeometricProjection.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	GeometricProjection() {
		super(true);
	}
}