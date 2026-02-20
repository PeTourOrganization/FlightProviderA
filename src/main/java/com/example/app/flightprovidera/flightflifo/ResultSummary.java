
package com.example.app.flightprovidera.flightflifo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultSummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Success" type="{http://services.sabre.com/STL_Header/v120}EmptyElement"/>
 *         <element name="Error" type="{http://services.sabre.com/STL_Header/v120}ProblemSummary"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSummary", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "success",
    "error"
})
public class ResultSummary {

    /**
     * Success indicates that the request was
     * 						processed successfully.
     * 
     */
    @XmlElement(name = "Success")
    protected String success;
    @XmlElement(name = "Error")
    protected ProblemSummary error;

    /**
     * Success indicates that the request was
     * 						processed successfully.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSuccess()
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemSummary }
     *     
     */
    public ProblemSummary getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemSummary }
     *     
     */
    public void setError(ProblemSummary value) {
        this.error = value;
    }

}
