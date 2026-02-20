
package com.example.app.flightprovidera.flightflifo;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Tracking Identifier is an identifier intended for use to a set of related items and provide an 
 * 			optional sequence number for the items.
 * 
 * <p>Java class for TrackingID complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TrackingID">
 *   <simpleContent>
 *     <extension base="<http://services.sabre.com/STL_Header/v120>Identifier">
 *       <attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingID", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "value"
})
public class TrackingID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "seq")
    protected BigInteger seq;

    /**
     * Gets the value of the value property.
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
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

}
