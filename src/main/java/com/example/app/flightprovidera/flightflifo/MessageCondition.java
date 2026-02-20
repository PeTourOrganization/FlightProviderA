
package com.example.app.flightprovidera.flightflifo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Free text and code provided by the application or system that detected the condition. 
 * 			Contents may be anything the system detecting the error chooses to convey. Used by service consumers.  
 * 			Codes and/or messages should be agreed upon by service users. 
 * 			Do not use for structured data, use parameters instead.
 * 
 * <p>Java class for Message.Condition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Message.Condition">
 *   <simpleContent>
 *     <extension base="<http://services.sabre.com/STL_Header/v120>Text.Long">
 *       <attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message.Condition", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "value"
})
public class MessageCondition {

    /**
     * Same as STL Text.Long - A field text characters and no other constraints.
     * 
     */
    @XmlValue
    protected String value;
    @XmlAttribute(name = "code")
    protected String code;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
