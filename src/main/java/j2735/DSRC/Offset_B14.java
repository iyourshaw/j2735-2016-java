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
public class Offset_B14 extends Asn1Integer {

	public Offset_B14() {
		super(-8192L, 8191L);
	}

	@JsonCreator
	public Offset_B14(long value) {
		this();
		this.value = value;
	}

	public static class Offset_B14Deserializer extends IntegerDeserializer<Offset_B14> {
		public Offset_B14Deserializer() {
			super(Offset_B14.class);
		}

		@Override
		protected Offset_B14 construct() {
			return new Offset_B14();
		}
	}
}