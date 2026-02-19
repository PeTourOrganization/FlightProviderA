
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for HostCommand complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCommand">
 *   <simpleContent>
 *     <extension base="<http://services.sabre.com/STL_Header/v120>Text.Long">
 *       <attribute name="LNIATA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommand", namespace = "http://services.sabre.com/STL/v01", propOrder = {
    "value"
})
public class HostCommand {

    /**
     * Same as STL Text.Long - A field text characters and no other constraints.
     * 
     */
    @XmlValue
    protected String value;
    @XmlAttribute(name = "LNIATA")
    protected String lniata;

    /**
     * Same as STL Text.Long - A field text characters and no other constraints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lniata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNIATA() {
        return lniata;
    }

    /**
     * Sets the value of the lniata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNIATA(String value) {
        this.lniata = value;
    }

}
