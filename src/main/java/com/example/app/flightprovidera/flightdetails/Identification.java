
package com.example.app.flightprovidera.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The Identification metadata uniquely identify each message instance.
 * 
 * <p>Java class for Identification complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Identification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerID" type="{http://services.sabre.com/STL_Header/v120}PseudoCityCodeOrOAC"/>
 *         <element name="CustomerAppID" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/>
 *         <element name="ConversationID" type="{http://services.sabre.com/STL_Header/v120}TrackingID"/>
 *         <element name="MessageID" type="{http://services.sabre.com/STL_Header/v120}Identifier"/>
 *         <element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "customerID",
    "customerAppID",
    "conversationID",
    "messageID",
    "timeStamp"
})
public class Identification {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "CustomerAppID")
    protected String customerAppID;
    /**
     * The ConversationId element is a string identifying the set of related messages that make up a
     * 						conversation between two or more Parties. The Party initiating a conversation determines the value of
     * 						the ConversationId element that shall be reflected in all messages pertaining to that
     * 						conversation. It remains constant for all messages within a conversation.
     * 						Service providers are expected to increment the optional TrackingID integer attribute when present.
     * 
     */
    @XmlElement(name = "ConversationID", required = true)
    protected TrackingID conversationID;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerAppID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAppID() {
        return customerAppID;
    }

    /**
     * Sets the value of the customerAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAppID(String value) {
        this.customerAppID = value;
    }

    /**
     * The ConversationId element is a string identifying the set of related messages that make up a
     * 						conversation between two or more Parties. The Party initiating a conversation determines the value of
     * 						the ConversationId element that shall be reflected in all messages pertaining to that
     * 						conversation. It remains constant for all messages within a conversation.
     * 						Service providers are expected to increment the optional TrackingID integer attribute when present.
     * 
     * @return
     *     possible object is
     *     {@link TrackingID }
     *     
     */
    public TrackingID getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingID }
     *     
     * @see #getConversationID()
     */
    public void setConversationID(TrackingID value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
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
