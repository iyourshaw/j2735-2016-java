package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1SequenceOf;
import asn2pojo.runtime.types.Asn1Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.REGION.Reg_RestrictionUserType;

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
public class RestrictionUserType extends Asn1Choice {

	@Asn1Property(tag = 0)
	private RestrictionAppliesTo basicType;
	@Asn1Property(tag = 1)
	private SequenceOfRegional regional;

	RestrictionUserType() {
		super(true);
	}

	public RestrictionAppliesTo getBasicType() {
		return basicType;
	}

	public void setBasicType(RestrictionAppliesTo basicType) {
		this.basicType = basicType;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_RestrictionUserType> {
		SequenceOfRegional() {
			super(Reg_RestrictionUserType.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	@Override
	protected List<Optional<Asn1Type>> listTypes() {
		return null;
	}
}