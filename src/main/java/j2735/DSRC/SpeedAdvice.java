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
public class SpeedAdvice extends Asn1Integer {

	public SpeedAdvice() {
		super(0L, 500L);
	}

	@JsonCreator
	public SpeedAdvice(long value) {
		this();
		this.value = value;
	}

	public static class SpeedAdviceDeserializer extends IntegerDeserializer<SpeedAdvice> {
		public SpeedAdviceDeserializer() {
			super(SpeedAdvice.class);
		}

		@Override
		protected SpeedAdvice construct() {
			return new SpeedAdvice();
		}
	}
}