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
public class DrivenLineOffsetSm extends Asn1Integer {

	public DrivenLineOffsetSm() {
		super(-2047L, 2047L);
	}

	@JsonCreator
	public DrivenLineOffsetSm(long value) {
		this();
		this.value = value;
	}

	public static class DrivenLineOffsetSmDeserializer extends IntegerDeserializer<DrivenLineOffsetSm> {
		public DrivenLineOffsetSmDeserializer() {
			super(DrivenLineOffsetSm.class);
		}

		@Override
		protected DrivenLineOffsetSm construct() {
			return new DrivenLineOffsetSm();
		}
	}
}