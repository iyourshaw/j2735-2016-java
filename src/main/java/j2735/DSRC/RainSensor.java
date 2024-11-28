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
@JsonSerialize(using = RainSensorSerializer.class)
@JsonDeserialize(using = RainSensorDeserializer.class)
public enum RainSensor implements Asn1Enumerated {
	none(0, "none"), lightMist(1, "lightMist"), heavyMist(2, "heavyMist"), lightRainOrDrizzle(3,
			"lightRainOrDrizzle"), rain(4, "rain"), moderateRain(5,
					"moderateRain"), heavyRain(6, "heavyRain"), heavyDownpour(7, "heavyDownpour");

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

	private RainSensor(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 7;
	}
}