package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import java.util.List;
import java.util.Optional;
import asn2pojo.runtime.types.Asn1Type;
import j2735.REGION.Reg_ComputedLane;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
public class ComputedLane extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = LaneID.LaneIDDeserializer.class)
	private LaneID referenceLaneId;
	@Asn1Property(tag = 1)
	private OffsetXaxisChoice offsetXaxis;
	@Asn1Property(tag = 2)
	private OffsetYaxisChoice offsetYaxis;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = Angle.AngleDeserializer.class)
	private Angle rotateXY;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = Scale_B12.Scale_B12Deserializer.class)
	private Scale_B12 scaleXaxis;
	@Asn1Property(tag = 5, optional = true)
	@JsonDeserialize(using = Scale_B12.Scale_B12Deserializer.class)
	private Scale_B12 scaleYaxis;
	@Asn1Property(tag = 6, optional = true)
	private SequenceOfRegional regional;

	public LaneID getReferenceLaneId() {
		return referenceLaneId;
	}

	public void setReferenceLaneId(LaneID referenceLaneId) {
		this.referenceLaneId = referenceLaneId;
	}

	@JsonInclude(Include.NON_NULL)
	public static class OffsetXaxisChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		@JsonDeserialize(using = DrivenLineOffsetSm.DrivenLineOffsetSmDeserializer.class)
		private DrivenLineOffsetSm small;
		@Asn1Property(tag = 1)
		@JsonDeserialize(using = DrivenLineOffsetLg.DrivenLineOffsetLgDeserializer.class)
		private DrivenLineOffsetLg large;

		OffsetXaxisChoice() {
			super(false);
		}

		public DrivenLineOffsetSm getSmall() {
			return small;
		}

		public void setSmall(DrivenLineOffsetSm small) {
			this.small = small;
		}

		public DrivenLineOffsetLg getLarge() {
			return large;
		}

		public void setLarge(DrivenLineOffsetLg large) {
			this.large = large;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public OffsetXaxisChoice getOffsetXaxis() {
		return offsetXaxis;
	}

	public void setOffsetXaxis(OffsetXaxisChoice offsetXaxis) {
		this.offsetXaxis = offsetXaxis;
	}

	@JsonInclude(Include.NON_NULL)
	public static class OffsetYaxisChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		@JsonDeserialize(using = DrivenLineOffsetSm.DrivenLineOffsetSmDeserializer.class)
		private DrivenLineOffsetSm small;
		@Asn1Property(tag = 1)
		@JsonDeserialize(using = DrivenLineOffsetLg.DrivenLineOffsetLgDeserializer.class)
		private DrivenLineOffsetLg large;

		OffsetYaxisChoice() {
			super(false);
		}

		public DrivenLineOffsetSm getSmall() {
			return small;
		}

		public void setSmall(DrivenLineOffsetSm small) {
			this.small = small;
		}

		public DrivenLineOffsetLg getLarge() {
			return large;
		}

		public void setLarge(DrivenLineOffsetLg large) {
			this.large = large;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public OffsetYaxisChoice getOffsetYaxis() {
		return offsetYaxis;
	}

	public void setOffsetYaxis(OffsetYaxisChoice offsetYaxis) {
		this.offsetYaxis = offsetYaxis;
	}

	public Angle getRotateXY() {
		return rotateXY;
	}

	public void setRotateXY(Angle rotateXY) {
		this.rotateXY = rotateXY;
	}

	public Scale_B12 getScaleXaxis() {
		return scaleXaxis;
	}

	public void setScaleXaxis(Scale_B12 scaleXaxis) {
		this.scaleXaxis = scaleXaxis;
	}

	public Scale_B12 getScaleYaxis() {
		return scaleYaxis;
	}

	public void setScaleYaxis(Scale_B12 scaleYaxis) {
		this.scaleYaxis = scaleYaxis;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_ComputedLane> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_ComputedLane.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	ComputedLane() {
		super(true);
	}
}