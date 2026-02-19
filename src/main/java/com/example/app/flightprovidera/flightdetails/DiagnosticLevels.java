
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DiagnosticLevels</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DiagnosticLevels">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Mock"/>
 *     <enumeration value="Simulate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DiagnosticLevels", namespace = "http://services.sabre.com/STL_Header/v120")
@XmlEnum
public enum DiagnosticLevels {


    /**
     * Return a sample message without invoking service logic.
     * 
     */
    @XmlEnumValue("Mock")
    MOCK("Mock"),

    /**
     * Compute response without making changes to service data, state or status.
     * 
     */
    @XmlEnumValue("Simulate")
    SIMULATE("Simulate");
    private final String value;

    DiagnosticLevels(String v) {
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
    public static DiagnosticLevels fromValue(String v) {
        for (DiagnosticLevels c: DiagnosticLevels.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
