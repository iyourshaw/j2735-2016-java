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
public class TestMessage04MessageFrame extends MessageFrame<TestMessage04> {

	public TestMessage04MessageFrame() {
		super(244, "TestMessage04");
	}

	@Override
	@JsonSerialize(using = TestMessage04MessageFrameValueSerializer.class)
	public TestMessage04 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage04MessageFrameValueDeserializer.class)
	public void setValue(TestMessage04 value) {
		super.setValue(value);
	}
}