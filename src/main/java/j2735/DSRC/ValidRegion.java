package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1Type;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidRegion extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private HeadingSlice direction;
	@Asn1Property(tag = 1, optional = true)
	private Extent extent;
	@Asn1Property(tag = 2)
	private AreaChoice area;

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

	@JsonInclude(Include.NON_NULL)
	public static class AreaChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		private ShapePointSet shapePointSet;
		@Asn1Property(tag = 1)
		private Circle circle;
		@Asn1Property(tag = 2)
		private RegionPointSet regionPointSet;

		AreaChoice() {
			super(false);
		}

		public ShapePointSet getShapePointSet() {
			return shapePointSet;
		}

		public void setShapePointSet(ShapePointSet shapePointSet) {
			this.shapePointSet = shapePointSet;
		}

		public Circle getCircle() {
			return circle;
		}

		public void setCircle(Circle circle) {
			this.circle = circle;
		}

		public RegionPointSet getRegionPointSet() {
			return regionPointSet;
		}

		public void setRegionPointSet(RegionPointSet regionPointSet) {
			this.regionPointSet = regionPointSet;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public AreaChoice getArea() {
		return area;
	}

	public void setArea(AreaChoice area) {
		this.area = area;
	}

	ValidRegion() {
		super(false);
	}
}