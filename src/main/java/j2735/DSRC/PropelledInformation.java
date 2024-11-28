package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;
import java.util.Optional;

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
public class PropelledInformation extends Asn1Choice {

	@Asn1Property(tag = 0)
	private HumanPropelledType human;
	@Asn1Property(tag = 1)
	private AnimalPropelledType animal;
	@Asn1Property(tag = 2)
	private MotorizedPropelledType motor;

	PropelledInformation() {
		super(true);
	}

	public HumanPropelledType getHuman() {
		return human;
	}

	public void setHuman(HumanPropelledType human) {
		this.human = human;
	}

	public AnimalPropelledType getAnimal() {
		return animal;
	}

	public void setAnimal(AnimalPropelledType animal) {
		this.animal = animal;
	}

	public MotorizedPropelledType getMotor() {
		return motor;
	}

	public void setMotor(MotorizedPropelledType motor) {
		this.motor = motor;
	}

	@Override
	protected List<Optional<Asn1Type>> listTypes() {
		return null;
	}
}