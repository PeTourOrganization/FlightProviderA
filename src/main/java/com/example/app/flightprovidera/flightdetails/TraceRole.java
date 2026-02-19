
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TraceRole</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TraceRole">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="consumer"/>
 *     <enumeration value="provider"/>
 *     <enumeration value="gateway"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TraceRole", namespace = "http://services.sabre.com/STL_Header/v120")
@XmlEnum
public enum TraceRole {


    /**
     * the system that initiated the service request and will be the ultimate consumer 
     * 					of the service results.
     * 
     */
    @XmlEnumValue("consumer")
    CONSUMER("consumer"),

    /**
     * System that performs the service operation defined in the service interface. 
     * 					For RQ/RS exchange patterns, the provider reads the request message, applies business logic and 
     * 					returns a response.
     * 
     */
    @XmlEnumValue("provider")
    PROVIDER("provider"),
    @XmlEnumValue("gateway")
    GATEWAY("gateway");
    private final String value;

    TraceRole(String v) {
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
    public static TraceRole fromValue(String v) {
        for (TraceRole c: TraceRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
