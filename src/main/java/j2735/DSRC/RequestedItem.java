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
@JsonSerialize(using = RequestedItemSerializer.class)
@JsonDeserialize(using = RequestedItemDeserializer.class)
public enum RequestedItem implements Asn1Enumerated {
	reserved(0, "reserved"), itemA(1, "itemA"), itemB(2, "itemB"), itemC(3, "itemC"), itemD(4, "itemD"), itemE(5,
			"itemE"), itemF(6, "itemF"), itemG(7, "itemG"), itemI(8, "itemI"), itemJ(9,
					"itemJ"), itemK(10, "itemK"), itemL(11, "itemL"), itemM(12,
							"itemM"), itemN(13, "itemN"), itemO(14, "itemO"), itemP(15, "itemP"), itemQ(16, "itemQ");

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

	private RequestedItem(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 16;
	}
}