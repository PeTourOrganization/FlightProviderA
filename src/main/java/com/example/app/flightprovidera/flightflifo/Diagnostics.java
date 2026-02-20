
package com.example.app.flightprovidera.flightflifo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diagnostics complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Diagnostics">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Level" type="{http://services.sabre.com/STL_Header/v120}DiagnosticLevels" minOccurs="0"/>
 *         <element name="Data" type="{http://services.sabre.com/STL_Header/v120}Text.Long" minOccurs="0"/>
 *         <element name="Diagnostic" type="{http://services.sabre.com/STL_Header/v120}DiagnosticResults" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostics", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "level",
    "data",
    "diagnostic"
})
public class Diagnostics {

    /**
     * Describes the level of diagnostic data requested or provided.
     * 
     */
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "string")
    protected DiagnosticLevels level;
    /**
     * Block of diagnostic data included in request or returned in the response.
     * 
     */
    @XmlElement(name = "Data")
    protected String data;
    /**
     * Diagnostic data. Must be defined in a differrent namespace as the header.
     * 
     */
    @XmlElement(name = "Diagnostic")
    protected DiagnosticResults diagnostic;

    /**
     * Describes the level of diagnostic data requested or provided.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticLevels }
     *     
     */
    public DiagnosticLevels getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticLevels }
     *     
     * @see #getLevel()
     */
    public void setLevel(DiagnosticLevels value) {
        this.level = value;
    }

    /**
     * Block of diagnostic data included in request or returned in the response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getData()
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Diagnostic data. Must be defined in a differrent namespace as the header.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticResults }
     *     
     */
    public DiagnosticResults getDiagnostic() {
        return diagnostic;
    }

    /**
     * Sets the value of the diagnostic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticResults }
     *     
     * @see #getDiagnostic()
     */
    public void setDiagnostic(DiagnosticResults value) {
        this.diagnostic = value;
    }

}
