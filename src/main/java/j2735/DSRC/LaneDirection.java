package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Bitstring;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
@JsonDeserialize(using = LaneDirectionDeserializer.class)
public class LaneDirection extends Asn1Bitstring {

	public boolean isIngressPath() {
		return get(0);
	}

	public void setIngressPath(boolean ingressPath) {
		set(0, ingressPath);
	}

	public boolean isEgressPath() {
		return get(1);
	}

	public void setEgressPath(boolean egressPath) {
		set(1, egressPath);
	}

	public LaneDirection() {
		super(2, false, new String[]{"ingressPath", "egressPath"});
	}
}