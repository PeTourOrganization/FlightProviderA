
package com.example.app.flightprovidera.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for sequenceNumber.type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="sequenceNumber.type">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *       <attribute name="status" type="{http://www.ebxml.org/namespaces/messageHeader}status.type" default="Continue" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sequenceNumber.type", namespace = "http://www.ebxml.org/namespaces/messageHeader", propOrder = {
    "value"
})
public class SequenceNumberType {

    @XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger value;
    @XmlAttribute(name = "status", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected StatusType status;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        if (status == null) {
            return StatusType.CONTINUE;
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
