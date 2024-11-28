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
public class TestMessage09MessageFrame extends MessageFrame<TestMessage09> {

	public TestMessage09MessageFrame() {
		super(249, "TestMessage09");
	}

	@Override
	@JsonSerialize(using = TestMessage09MessageFrameValueSerializer.class)
	public TestMessage09 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage09MessageFrameValueDeserializer.class)
	public void setValue(TestMessage09 value) {
		super.setValue(value);
	}
}