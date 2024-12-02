package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Integer;
import com.fasterxml.jackson.annotation.JsonCreator;
import asn2pojo.runtime.serialization.IntegerDeserializer;

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
public class TimeOffset extends Asn1Integer {

	public TimeOffset() {
		super(1L, 65535L);
	}

	@JsonCreator
	public TimeOffset(long value) {
		this();
		this.value = value;
	}

	public static class TimeOffsetDeserializer extends IntegerDeserializer<TimeOffset> {
		public TimeOffsetDeserializer() {
			super(TimeOffset.class);
		}

		@Override
		protected TimeOffset construct() {
			return new TimeOffset();
		}
	}
}