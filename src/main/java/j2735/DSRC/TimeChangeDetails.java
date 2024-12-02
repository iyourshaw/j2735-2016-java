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
public class TimeChangeDetails extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JsonDeserialize(using = TimeMark.TimeMarkDeserializer.class)
	private TimeMark startTime;
	@Asn1Property(tag = 1)
	@JsonDeserialize(using = TimeMark.TimeMarkDeserializer.class)
	private TimeMark minEndTime;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = TimeMark.TimeMarkDeserializer.class)
	private TimeMark maxEndTime;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = TimeMark.TimeMarkDeserializer.class)
	private TimeMark likelyTime;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = TimeIntervalConfidence.TimeIntervalConfidenceDeserializer.class)
	private TimeIntervalConfidence confidence;
	@Asn1Property(tag = 5, optional = true)
	@JsonDeserialize(using = TimeMark.TimeMarkDeserializer.class)
	private TimeMark nextTime;

	public TimeMark getStartTime() {
		return startTime;
	}

	public void setStartTime(TimeMark startTime) {
		this.startTime = startTime;
	}

	public TimeMark getMinEndTime() {
		return minEndTime;
	}

	public void setMinEndTime(TimeMark minEndTime) {
		this.minEndTime = minEndTime;
	}

	public TimeMark getMaxEndTime() {
		return maxEndTime;
	}

	public void setMaxEndTime(TimeMark maxEndTime) {
		this.maxEndTime = maxEndTime;
	}

	public TimeMark getLikelyTime() {
		return likelyTime;
	}

	public void setLikelyTime(TimeMark likelyTime) {
		this.likelyTime = likelyTime;
	}

	public TimeIntervalConfidence getConfidence() {
		return confidence;
	}

	public void setConfidence(TimeIntervalConfidence confidence) {
		this.confidence = confidence;
	}

	public TimeMark getNextTime() {
		return nextTime;
	}

	public void setNextTime(TimeMark nextTime) {
		this.nextTime = nextTime;
	}

	TimeChangeDetails() {
		super(false);
	}
}