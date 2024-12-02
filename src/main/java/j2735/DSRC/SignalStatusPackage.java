package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_SignalStatusPackage;
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
public class SignalStatusPackage extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private SignalRequesterInfo requester;
	@Asn1Property(tag = 1)
	private IntersectionAccessPoint inboundOn;
	@Asn1Property(tag = 2, optional = true)
	private IntersectionAccessPoint outboundOn;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = MinuteOfTheYear.MinuteOfTheYearDeserializer.class)
	private MinuteOfTheYear minute;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = DSecond.DSecondDeserializer.class)
	private DSecond second;
	@Asn1Property(tag = 5, optional = true)
	@JsonDeserialize(using = DSecond.DSecondDeserializer.class)
	private DSecond duration;
	@Asn1Property(tag = 6)
	private PrioritizationResponseStatus status;
	@Asn1Property(tag = 7, optional = true)
	private SequenceOfRegional regional;

	public SignalRequesterInfo getRequester() {
		return requester;
	}

	public void setRequester(SignalRequesterInfo requester) {
		this.requester = requester;
	}

	public IntersectionAccessPoint getInboundOn() {
		return inboundOn;
	}

	public void setInboundOn(IntersectionAccessPoint inboundOn) {
		this.inboundOn = inboundOn;
	}

	public IntersectionAccessPoint getOutboundOn() {
		return outboundOn;
	}

	public void setOutboundOn(IntersectionAccessPoint outboundOn) {
		this.outboundOn = outboundOn;
	}

	public MinuteOfTheYear getMinute() {
		return minute;
	}

	public void setMinute(MinuteOfTheYear minute) {
		this.minute = minute;
	}

	public DSecond getSecond() {
		return second;
	}

	public void setSecond(DSecond second) {
		this.second = second;
	}

	public DSecond getDuration() {
		return duration;
	}

	public void setDuration(DSecond duration) {
		this.duration = duration;
	}

	public PrioritizationResponseStatus getStatus() {
		return status;
	}

	public void setStatus(PrioritizationResponseStatus status) {
		this.status = status;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_SignalStatusPackage> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_SignalStatusPackage.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	SignalStatusPackage() {
		super(true);
	}
}