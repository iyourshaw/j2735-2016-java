package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
public class TransmissionAndSpeed extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private TransmissionState transmisson;
	@Asn1Property(tag = 1)
	private Velocity speed;

	public TransmissionState getTransmisson() {
		return transmisson;
	}

	public void setTransmisson(TransmissionState transmisson) {
		this.transmisson = transmisson;
	}

	public Velocity getSpeed() {
		return speed;
	}

	public void setSpeed(Velocity speed) {
		this.speed = speed;
	}

	TransmissionAndSpeed() {
		super(false);
	}
}