package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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
@JsonRootName("MessageFrame")
public class RoadSideAlertMessageFrame extends MessageFrame<RoadSideAlert> {

	public RoadSideAlertMessageFrame() {
		super(27, "RoadSideAlert");
	}

	@Override
	@JsonSerialize(using = RoadSideAlertMessageFrameValueSerializer.class)
	public RoadSideAlert getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = RoadSideAlertMessageFrameValueDeserializer.class)
	public void setValue(RoadSideAlert value) {
		super.setValue(value);
	}
}