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
public class LatitudeDMS extends Asn1Integer {

	public LatitudeDMS() {
		super(-32400000L, 32400000L);
	}

	@JsonCreator
	public LatitudeDMS(long value) {
		this();
		this.value = value;
	}
}