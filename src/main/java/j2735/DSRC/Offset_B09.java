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
public class Offset_B09 extends Asn1Integer {

	public Offset_B09() {
		super(-256L, 255L);
	}

	@JsonCreator
	public Offset_B09(long value) {
		this();
		this.value = value;
	}
}