package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
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
public class DTime extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = DHour.DHourDeserializer.class)
	private DHour hour;
	@Asn1Property(tag = 1)
	@JsonDeserialize(using = DMinute.DMinuteDeserializer.class)
	private DMinute minute;
	@Asn1Property(tag = 2)
	@JsonDeserialize(using = DSecond.DSecondDeserializer.class)
	private DSecond second;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = DOffset.DOffsetDeserializer.class)
	private DOffset offset;

	public DHour getHour() {
		return hour;
	}

	public void setHour(DHour hour) {
		this.hour = hour;
	}

	public DMinute getMinute() {
		return minute;
	}

	public void setMinute(DMinute minute) {
		this.minute = minute;
	}

	public DSecond getSecond() {
		return second;
	}

	public void setSecond(DSecond second) {
		this.second = second;
	}

	public DOffset getOffset() {
		return offset;
	}

	public void setOffset(DOffset offset) {
		this.offset = offset;
	}

	DTime() {
		super(false);
	}
}