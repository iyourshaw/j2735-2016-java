package j2735.ITIS;

import asn2pojo.runtime.serialization.EnumeratedDeserializer;

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
public class IncidentResponseEquipmentDeserializer extends EnumeratedDeserializer<IncidentResponseEquipment> {

	IncidentResponseEquipmentDeserializer() {
		super(IncidentResponseEquipment.class);
	}

	@Override
	protected IncidentResponseEquipment[] listEnumValues() {
		return IncidentResponseEquipment.values();
	}
}