
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CompletionCodes</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CompletionCodes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Complete"/>
 *     <enumeration value="Incomplete"/>
 *     <enumeration value="NotProcessed"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CompletionCodes", namespace = "http://services.sabre.com/STL_Header/v120")
@XmlEnum
public enum CompletionCodes {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CompletionCodes(String v) {
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
    public static CompletionCodes fromValue(String v) {
        for (CompletionCodes c: CompletionCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
