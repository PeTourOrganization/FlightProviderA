
package com.example.app.flightprovidera.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProblemBase complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProblemBase">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *       <attribute name="type" use="required" type="{http://services.sabre.com/STL_Header/v120}ErrorType" />
 *       <attribute name="status" use="required" type="{http://services.sabre.com/STL_Header/v120}CompletionCodes" />
 *       <attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemBase", namespace = "http://services.sabre.com/STL_Header/v120")
public class ProblemBase {

    /**
     * An indication of the source of error when processing the request.
     * 
     */
    @XmlAttribute(name = "type", required = true)
    protected ErrorType type;
    /**
     * Impact of the error on process completion.
     * 
     */
    @XmlAttribute(name = "status", required = true)
    protected CompletionCodes status;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * An indication of the source of error when processing the request.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     * @see #getType()
     */
    public void setType(ErrorType value) {
        this.type = value;
    }

    /**
     * Impact of the error on process completion.
     * 
     * @return
     *     possible object is
     *     {@link CompletionCodes }
     *     
     */
    public CompletionCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionCodes }
     *     
     * @see #getStatus()
     */
    public void setStatus(CompletionCodes value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
