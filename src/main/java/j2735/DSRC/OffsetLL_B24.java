package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Integer;
import com.fasterxml.jackson.annotation.JsonCreator;

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
public class OffsetLL_B24 extends Asn1Integer {

	public OffsetLL_B24() {
		super(-8388608L, 8388607L);
	}

	@JsonCreator
	public OffsetLL_B24(long value) {
		this();
		this.value = value;
	}
}