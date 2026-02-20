
package com.example.app.flightprovidera.flightflifo;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProblemSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProblemSummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Source" type="{http://services.sabre.com/STL_Header/v120}Identifier.System" minOccurs="0"/>
 *         <element name="ReportingSystem" type="{http://services.sabre.com/STL_Header/v120}Identifier.System"/>
 *         <element name="Message" type="{http://services.sabre.com/STL_Header/v120}Message.Condition" minOccurs="0"/>
 *         <element name="ShortText" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/>
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
@XmlType(name = "ProblemSummary", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "source",
    "reportingSystem",
    "message",
    "shortText"
})
public class ProblemSummary {

    /**
     * The system that the reporting system deemed to be the cause of the problem. If omitted, the
     * 						reporting system is also the source of the problem. For application errors, the element may
     * 						identify a system the application is dependent upon that failed to respond. For validation
     * 						errors this may identify the service consumer.
     * 
     */
    @XmlElement(name = "Source")
    protected IdentifierSystem source;
    /**
     * The system that created the results record. If the Source system identifier is omitted, the
     * 						system identified here both was the cause of the problem and created the result record.
     * 
     */
    @XmlElement(name = "ReportingSystem", required = true)
    protected IdentifierSystem reportingSystem;
    /**
     * An informative code and message that describes the results. Note: the message code and text must
     * 						NOT be required to process to understand retry/compensate status.
     * 						This value should be the same as in the SystemSpecificResults in the body.
     * 
     */
    @XmlElement(name = "Message")
    protected MessageCondition message;
    /**
     * An abbreviated version of the error in textual format.
     * 						This value should be the same as in the SystemSpecificResults in the body.
     * 
     */
    @XmlElement(name = "ShortText")
    protected String shortText;
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
     * The system that the reporting system deemed to be the cause of the problem. If omitted, the
     * 						reporting system is also the source of the problem. For application errors, the element may
     * 						identify a system the application is dependent upon that failed to respond. For validation
     * 						errors this may identify the service consumer.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierSystem }
     *     
     */
    public IdentifierSystem getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierSystem }
     *     
     * @see #getSource()
     */
    public void setSource(IdentifierSystem value) {
        this.source = value;
    }

    /**
     * The system that created the results record. If the Source system identifier is omitted, the
     * 						system identified here both was the cause of the problem and created the result record.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierSystem }
     *     
     */
    public IdentifierSystem getReportingSystem() {
        return reportingSystem;
    }

    /**
     * Sets the value of the reportingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierSystem }
     *     
     * @see #getReportingSystem()
     */
    public void setReportingSystem(IdentifierSystem value) {
        this.reportingSystem = value;
    }

    /**
     * An informative code and message that describes the results. Note: the message code and text must
     * 						NOT be required to process to understand retry/compensate status.
     * 						This value should be the same as in the SystemSpecificResults in the body.
     * 
     * @return
     *     possible object is
     *     {@link MessageCondition }
     *     
     */
    public MessageCondition getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageCondition }
     *     
     * @see #getMessage()
     */
    public void setMessage(MessageCondition value) {
        this.message = value;
    }

    /**
     * An abbreviated version of the error in textual format.
     * 						This value should be the same as in the SystemSpecificResults in the body.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * Sets the value of the shortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortText()
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

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
