package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_CommonSafetyRequest;
import asn2pojo.runtime.types.Asn1SequenceOf;
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
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonSafetyRequest extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JsonDeserialize(using = MinuteOfTheYear.MinuteOfTheYearDeserializer.class)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1, optional = true)
	@JsonDeserialize(using = MsgCount.MsgCountDeserializer.class)
	private MsgCount msgCnt;
	@Asn1Property(tag = 2, optional = true)
	private TemporaryID id;
	@Asn1Property(tag = 3)
	@JsonDeserialize(using = RequestedItemList.RequestedItemListDeserializer.class)
	private RequestedItemList requests;
	@Asn1Property(tag = 4, optional = true)
	private SequenceOfRegional regional;

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public MsgCount getMsgCnt() {
		return msgCnt;
	}

	public void setMsgCnt(MsgCount msgCnt) {
		this.msgCnt = msgCnt;
	}

	public TemporaryID getId() {
		return id;
	}

	public void setId(TemporaryID id) {
		this.id = id;
	}

	public RequestedItemList getRequests() {
		return requests;
	}

	public void setRequests(RequestedItemList requests) {
		this.requests = requests;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_CommonSafetyRequest> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_CommonSafetyRequest.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	CommonSafetyRequest() {
		super(true);
	}
}