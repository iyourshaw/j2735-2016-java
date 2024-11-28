package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Choice;
import asn2pojo.runtime.types.Asn1Type;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class NodeListLL extends Asn1Choice {

	@Asn1Property(tag = 0)
	@JacksonXmlElementWrapper(localName = "nodes")
	@JacksonXmlProperty(localName = "NodeLL")
	private NodeSetLL nodes;

	NodeListLL() {
		super(true);
	}

	public NodeSetLL getNodes() {
		return nodes;
	}

	public void setNodes(NodeSetLL nodes) {
		this.nodes = nodes;
	}

	@Override
	protected List<Optional<Asn1Type>> listTypes() {
		return null;
	}
}