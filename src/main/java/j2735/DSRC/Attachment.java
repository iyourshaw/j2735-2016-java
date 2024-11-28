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
@JsonSerialize(using = AttachmentSerializer.class)
@JsonDeserialize(using = AttachmentDeserializer.class)
public enum Attachment implements Asn1Enumerated {
	unavailable(0, "unavailable"), stroller(1, "stroller"), bicycleTrailer(2, "bicycleTrailer"), cart(3,
			"cart"), wheelchair(4,
					"wheelchair"), otherWalkAssistAttachments(5, "otherWalkAssistAttachments"), pet(6, "pet");

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

	private Attachment(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 6;
	}
}