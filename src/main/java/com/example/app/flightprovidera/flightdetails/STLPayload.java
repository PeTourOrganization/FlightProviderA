
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * All message roots should be created as an extension of this base type. Global message elements
 * 				must declare they are a member of the STL_Payload substitution group. This type may be used when an empty payload is
 * 				needed for error handling.
 * 
 * <p>Java class for STL_Payload complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="STL_Payload">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://services.sabre.com/STL/v01}ApplicationResults" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="version">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STL_Payload", namespace = "http://services.sabre.com/STL/v01", propOrder = {
    "applicationResults"
})
public class STLPayload {

    /**
     * ApplicationResults can be used anywhere where Results is referenced, specifically as
     * 				the contents of a Sabre SOAP Fault/detail element.
     * 
     */
    @XmlElement(name = "ApplicationResults")
    protected ApplicationResults applicationResults;
    /**
     * Version of the payload message.
     * 
     */
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * ApplicationResults can be used anywhere where Results is referenced, specifically as
     * 				the contents of a Sabre SOAP Fault/detail element.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     * @see #getApplicationResults()
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Version of the payload message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
