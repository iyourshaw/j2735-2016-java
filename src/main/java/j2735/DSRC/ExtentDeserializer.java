package j2735.DSRC;

import asn2pojo.runtime.serialization.EnumeratedDeserializer;

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
public class ExtentDeserializer extends EnumeratedDeserializer<Extent> {

	ExtentDeserializer() {
		super(Extent.class);
	}

	@Override
	protected Extent[] listEnumValues() {
		return Extent.values();
	}
}