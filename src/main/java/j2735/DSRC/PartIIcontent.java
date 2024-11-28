package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
abstract public class PartIIcontent<TValue> extends Asn1Sequence {

	@JsonIgnore
	final protected PartII_Id partII_Id;
	@JsonIgnore
	final protected String name;
	private TValue partII_Value;
	public final static String INFORMATION_OBJECT_CLASS = "PARTII_EXT_ID_AND_TYPE";

	public PartII_Id getPartII_Id() {
		return partII_Id;
	}

	public String getName() {
		return name;
	}

	@JsonProperty("partII-Id")
	public String getIdString() {
		return partII_Id.toString();
	}

	public TValue getPartII_Value() {
		return partII_Value;
	}

	public void setPartII_Value(TValue partII_Value) {
		this.partII_Value = partII_Value;
	}

	public PartIIcontent(int id, String name) {
		super(true);
		var theId = new PartII_Id();
		theId.setValue(id);
		this.partII_Id = theId;
		this.name = name;
	}
}