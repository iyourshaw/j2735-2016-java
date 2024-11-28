package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_SignalRequestMessage;

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
public class SignalRequestMessage extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1)
	private DSecond second;
	@Asn1Property(tag = 2, optional = true)
	private MsgCount sequenceNumber;
	@Asn1Property(tag = 3, optional = true)
	@JacksonXmlElementWrapper(localName = "requests")
	@JacksonXmlProperty(localName = "SignalRequestPackage")
	private SignalRequestList requests;
	@Asn1Property(tag = 4)
	private RequestorDescription requestor;
	@Asn1Property(tag = 5, optional = true)
	private SequenceOfRegional regional;

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public DSecond getSecond() {
		return second;
	}

	public void setSecond(DSecond second) {
		this.second = second;
	}

	public MsgCount getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(MsgCount sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public SignalRequestList getRequests() {
		return requests;
	}

	public void setRequests(SignalRequestList requests) {
		this.requests = requests;
	}

	public RequestorDescription getRequestor() {
		return requestor;
	}

	public void setRequestor(RequestorDescription requestor) {
		this.requestor = requestor;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_SignalRequestMessage> {
		SequenceOfRegional() {
			super(Reg_SignalRequestMessage.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	SignalRequestMessage() {
		super(true);
	}
}