package j2735.AddGrpB;

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
public class Month extends Asn1Integer {

	public Month() {
		super(1L, 255L);
	}

	@JsonCreator
	public Month(long value) {
		this();
		this.value = value;
	}
}