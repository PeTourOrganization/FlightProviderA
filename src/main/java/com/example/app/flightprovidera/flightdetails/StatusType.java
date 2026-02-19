
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for status.type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="status.type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Reset"/>
 *     <enumeration value="Continue"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "status.type", namespace = "http://www.ebxml.org/namespaces/messageHeader")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("Continue")
    CONTINUE("Continue");
    private final String value;

    StatusType(String v) {
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
    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
