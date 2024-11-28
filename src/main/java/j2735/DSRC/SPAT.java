package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import j2735.REGION.Reg_SPAT;

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
public class SPAT extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 2)
	@JacksonXmlElementWrapper(localName = "intersections")
	@JacksonXmlProperty(localName = "IntersectionState")
	private IntersectionStateList intersections;
	@Asn1Property(tag = 3, optional = true)
	private SequenceOfRegional regional;

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public DescriptiveName getName() {
		return name;
	}

	public void setName(DescriptiveName name) {
		this.name = name;
	}

	public IntersectionStateList getIntersections() {
		return intersections;
	}

	public void setIntersections(IntersectionStateList intersections) {
		this.intersections = intersections;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_SPAT> {
		SequenceOfRegional() {
			super(Reg_SPAT.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	SPAT() {
		super(true);
	}
}