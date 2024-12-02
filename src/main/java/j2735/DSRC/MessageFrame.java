package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import j2735.DSRC.DSRCmsgID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import asn2pojo.runtime.annotations.Asn1ParameterizedTypes;
import asn2pojo.runtime.annotations.Asn1ParameterizedTypes.IdType;
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
@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "messageId")
@JsonSubTypes({@JsonSubTypes.Type(value = j2735.DSRC.BasicSafetyMessageMessageFrame.class, name = "20"),
		@JsonSubTypes.Type(value = j2735.DSRC.MapDataMessageFrame.class, name = "18"),
		@JsonSubTypes.Type(value = j2735.DSRC.SPATMessageFrame.class, name = "19"),
		@JsonSubTypes.Type(value = j2735.DSRC.CommonSafetyRequestMessageFrame.class, name = "21"),
		@JsonSubTypes.Type(value = j2735.DSRC.EmergencyVehicleAlertMessageFrame.class, name = "22"),
		@JsonSubTypes.Type(value = j2735.DSRC.IntersectionCollisionMessageFrame.class, name = "23"),
		@JsonSubTypes.Type(value = j2735.DSRC.NMEAcorrectionsMessageFrame.class, name = "24"),
		@JsonSubTypes.Type(value = j2735.DSRC.ProbeDataManagementMessageFrame.class, name = "25"),
		@JsonSubTypes.Type(value = j2735.DSRC.ProbeVehicleDataMessageFrame.class, name = "26"),
		@JsonSubTypes.Type(value = j2735.DSRC.RoadSideAlertMessageFrame.class, name = "27"),
		@JsonSubTypes.Type(value = j2735.DSRC.RTCMcorrectionsMessageFrame.class, name = "28"),
		@JsonSubTypes.Type(value = j2735.DSRC.SignalRequestMessageMessageFrame.class, name = "29"),
		@JsonSubTypes.Type(value = j2735.DSRC.SignalStatusMessageMessageFrame.class, name = "30"),
		@JsonSubTypes.Type(value = j2735.DSRC.TravelerInformationMessageFrame.class, name = "31"),
		@JsonSubTypes.Type(value = j2735.DSRC.PersonalSafetyMessageMessageFrame.class, name = "32"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage00MessageFrame.class, name = "240"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage01MessageFrame.class, name = "241"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage02MessageFrame.class, name = "242"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage03MessageFrame.class, name = "243"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage04MessageFrame.class, name = "244"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage05MessageFrame.class, name = "245"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage06MessageFrame.class, name = "246"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage07MessageFrame.class, name = "247"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage08MessageFrame.class, name = "248"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage09MessageFrame.class, name = "249"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage10MessageFrame.class, name = "250"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage11MessageFrame.class, name = "251"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage12MessageFrame.class, name = "252"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage13MessageFrame.class, name = "253"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage14MessageFrame.class, name = "254"),
		@JsonSubTypes.Type(value = j2735.DSRC.TestMessage15MessageFrame.class, name = "255")})
@Asn1ParameterizedTypes(idProperty = "messageId", idType = IdType.INTEGER, valueProperty = "value", value = {
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.BasicSafetyMessageMessageFrame.class, intId = 20),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.MapDataMessageFrame.class, intId = 18),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.SPATMessageFrame.class, intId = 19),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.CommonSafetyRequestMessageFrame.class, intId = 21),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.EmergencyVehicleAlertMessageFrame.class, intId = 22),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.IntersectionCollisionMessageFrame.class, intId = 23),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.NMEAcorrectionsMessageFrame.class, intId = 24),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.ProbeDataManagementMessageFrame.class, intId = 25),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.ProbeVehicleDataMessageFrame.class, intId = 26),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.RoadSideAlertMessageFrame.class, intId = 27),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.RTCMcorrectionsMessageFrame.class, intId = 28),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.SignalRequestMessageMessageFrame.class, intId = 29),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.SignalStatusMessageMessageFrame.class, intId = 30),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TravelerInformationMessageFrame.class, intId = 31),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.PersonalSafetyMessageMessageFrame.class, intId = 32),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage00MessageFrame.class, intId = 240),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage01MessageFrame.class, intId = 241),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage02MessageFrame.class, intId = 242),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage03MessageFrame.class, intId = 243),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage04MessageFrame.class, intId = 244),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage05MessageFrame.class, intId = 245),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage06MessageFrame.class, intId = 246),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage07MessageFrame.class, intId = 247),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage08MessageFrame.class, intId = 248),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage09MessageFrame.class, intId = 249),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage10MessageFrame.class, intId = 250),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage11MessageFrame.class, intId = 251),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage12MessageFrame.class, intId = 252),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage13MessageFrame.class, intId = 253),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage14MessageFrame.class, intId = 254),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.TestMessage15MessageFrame.class, intId = 255)})
abstract public class MessageFrame<TValue> extends Asn1Sequence {

	@JsonIgnore
	@JsonDeserialize(using = DSRCmsgID.DSRCmsgIDDeserializer.class)
	final protected DSRCmsgID messageId;
	@JsonIgnore
	final protected String name;
	private TValue value;
	public final static String INFORMATION_OBJECT_CLASS = "MESSAGE_ID_AND_TYPE";

	public DSRCmsgID getMessageId() {
		return messageId;
	}

	public String getName() {
		return name;
	}

	@JsonProperty("messageId")
	public String getIdString() {
		return messageId.toString();
	}

	public TValue getValue() {
		return value;
	}

	public void setValue(TValue value) {
		this.value = value;
	}

	public MessageFrame(int id, String name) {
		super(true);
		var theId = new j2735.DSRC.DSRCmsgID();
		theId.setValue(id);
		this.messageId = theId;
		this.name = name;
	}
}