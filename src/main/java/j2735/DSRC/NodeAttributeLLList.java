package j2735.DSRC;

import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import asn2pojo.runtime.serialization.SequenceOfEnumeratedDeserializer;

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
public class NodeAttributeLLList extends Asn1SequenceOf<NodeAttributeLL> {

	NodeAttributeLLList() {
		super(NodeAttributeLL.class, 1L, 8L);
	}

	public static class NodeAttributeLLListDeserializer
			extends
				SequenceOfEnumeratedDeserializer<NodeAttributeLL, NodeAttributeLLList> {
		public NodeAttributeLLListDeserializer() {
			super(NodeAttributeLLList.class, NodeAttributeLL.class);
		}

		@Override
		protected NodeAttributeLL[] listEnumValues() {
			return NodeAttributeLL.values();
		}

		@Override
		protected NodeAttributeLLList construct() {
			return new NodeAttributeLLList();
		}
	}
}