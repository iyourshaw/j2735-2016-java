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
public class Elevation extends Asn1Integer {

	public Elevation() {
		super(-4096L, 61439L);
	}

	@JsonCreator
	public Elevation(long value) {
		this();
		this.value = value;
	}

	public static class ElevationDeserializer extends IntegerDeserializer<Elevation> {
		public ElevationDeserializer() {
			super(Elevation.class);
		}

		@Override
		protected Elevation construct() {
			return new Elevation();
		}
	}
}