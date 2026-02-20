
package com.example.app.flightprovidera.flightflifo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for messageStatus.type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="messageStatus.type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="UnAuthorized"/>
 *     <enumeration value="NotRecognized"/>
 *     <enumeration value="Received"/>
 *     <enumeration value="Processed"/>
 *     <enumeration value="Forwarded"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "messageStatus.type", namespace = "http://www.ebxml.org/namespaces/messageHeader")
@XmlEnum
public enum MessageStatusType {

    @XmlEnumValue("UnAuthorized")
    UN_AUTHORIZED("UnAuthorized"),
    @XmlEnumValue("NotRecognized")
    NOT_RECOGNIZED("NotRecognized"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded");
    private final String value;

    MessageStatusType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static MessageStatusType fromValue(String v) {
        for (MessageStatusType c: MessageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
