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
public class DFullTime extends Asn1Sequence {

	@Asn1Property(tag = 0)
	@JsonDeserialize(using = DYear.DYearDeserializer.class)
	private DYear year;
	@Asn1Property(tag = 1)
	@JsonDeserialize(using = DMonth.DMonthDeserializer.class)
	private DMonth month;
	@Asn1Property(tag = 2)
	@JsonDeserialize(using = DDay.DDayDeserializer.class)
	private DDay day;
	@Asn1Property(tag = 3)
	@JsonDeserialize(using = DHour.DHourDeserializer.class)
	private DHour hour;
	@Asn1Property(tag = 4)
	@JsonDeserialize(using = DMinute.DMinuteDeserializer.class)
	private DMinute minute;

	public DYear getYear() {
		return year;
	}

	public void setYear(DYear year) {
		this.year = year;
	}

	public DMonth getMonth() {
		return month;
	}

	public void setMonth(DMonth month) {
		this.month = month;
	}

	public DDay getDay() {
		return day;
	}

	public void setDay(DDay day) {
		this.day = day;
	}

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

	DFullTime() {
		super(false);
	}
}