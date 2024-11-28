package j2735.AddGrpC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.DSRC.NodeOffsetPointXY;
import j2735.DSRC.SignalGroupID;

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
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignalHeadLocation extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private NodeOffsetPointXY node;
	@Asn1Property(tag = 1)
	private SignalGroupID signalGroupID;

	public NodeOffsetPointXY getNode() {
		return node;
	}

	public void setNode(NodeOffsetPointXY node) {
		this.node = node;
	}

	public SignalGroupID getSignalGroupID() {
		return signalGroupID;
	}

	public void setSignalGroupID(SignalGroupID signalGroupID) {
		this.signalGroupID = signalGroupID;
	}

	SignalHeadLocation() {
		super(true);
	}
}