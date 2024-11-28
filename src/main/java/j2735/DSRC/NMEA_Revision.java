package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Enumerated;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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
@JsonSerialize(using = NMEA_RevisionSerializer.class)
@JsonDeserialize(using = NMEA_RevisionDeserializer.class)
public enum NMEA_Revision implements Asn1Enumerated {
	unknown(0, "unknown"), reserved(1, "reserved"), rev1(2, "rev1"), rev2(3, "rev2"), rev3(4, "rev3"), rev4(5,
			"rev4"), rev5(6, "rev5");

	private final int index;
	private final String name;

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public boolean hasExtensionMarker() {
		return false;
	}

	private NMEA_Revision(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 6;
	}
}