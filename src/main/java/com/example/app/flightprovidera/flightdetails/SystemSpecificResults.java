
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSpecificResults complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SystemSpecificResults">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostCommand" type="{http://services.sabre.com/STL/v01}HostCommand" minOccurs="0"/>
 *         <element name="Message" type="{http://services.sabre.com/STL_Header/v120}Message.Condition" maxOccurs="99" minOccurs="0"/>
 *         <element name="ShortText" type="{http://services.sabre.com/STL_Header/v120}Text.Short" minOccurs="0"/>
 *         <element name="Element" type="{http://services.sabre.com/STL_Header/v120}Text.Long" minOccurs="0"/>
 *         <element name="RecordID" type="{http://services.sabre.com/STL_Header/v120}Identifier" minOccurs="0"/>
 *         <element name="DocURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSpecificResults", namespace = "http://services.sabre.com/STL/v01", propOrder = {
    "hostCommand",
    "message",
    "shortText",
    "element",
    "recordID",
    "docURL"
})
public class SystemSpecificResults {

    /**
     * Host system command run to create this result.
     * 
     */
    @XmlElement(name = "HostCommand")
    protected HostCommand hostCommand;
    /**
     * Application specific code and Message. A textual description to provide more 
     * 					information about the specific condition, warning or error  with code attribute as numeric value.
     * 
     */
    @XmlElement(name = "Message")
    protected List<MessageCondition> message;
    /**
     * An abbreviated version of the error in textual format.
     * 
     */
    @XmlElement(name = "ShortText")
    protected String shortText;
    /**
     * If present, this attribute may identify an unknown or misspelled tag that caused 
     * 					an error in processing. It is recommended that the Tag attribute use XPath notation to identify the 
     * 					location of a tag in the event that more than one tag of the same name is present in the document. 
     * 					Alternatively, the tag name alone can be used to identify missing data [Type=ReqFieldMissing].
     * 
     */
    @XmlElement(name = "Element")
    protected String element;
    /**
     * If present, this attribute allows for batch processing and the identification of the 
     * 					record that failed amongst a group of records. This value may contain a concatenation of a unique failed 
     * 					transaction ID with specific record(s) associated with that transaction.
     * 
     */
    @XmlElement(name = "RecordID")
    protected String recordID;
    /**
     * If present, this attribute refers to an online description of the error that occurred.
     * 
     */
    @XmlElement(name = "DocURL")
    @XmlSchemaType(name = "anyURI")
    protected String docURL;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Host system command run to create this result.
     * 
     * @return
     *     possible object is
     *     {@link HostCommand }
     *     
     */
    public HostCommand getHostCommand() {
        return hostCommand;
    }

    /**
     * Sets the value of the hostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCommand }
     *     
     * @see #getHostCommand()
     */
    public void setHostCommand(HostCommand value) {
        this.hostCommand = value;
    }

    /**
     * Application specific code and Message. A textual description to provide more 
     * 					information about the specific condition, warning or error  with code attribute as numeric value.
     * 
     * Gets the value of the message property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageCondition }
     * </p>
     * 
     * 
     * @return
     *     The value of the message property.
     */
    public List<MessageCondition> getMessage() {
        if (message == null) {
            message = new ArrayList<>();
        }
        return this.message;
    }

    /**
     * An abbreviated version of the error in textual format.
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
     * If present, this attribute may identify an unknown or misspelled tag that caused 
     * 					an error in processing. It is recommended that the Tag attribute use XPath notation to identify the 
     * 					location of a tag in the event that more than one tag of the same name is present in the document. 
     * 					Alternatively, the tag name alone can be used to identify missing data [Type=ReqFieldMissing].
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getElement()
     */
    public void setElement(String value) {
        this.element = value;
    }

    /**
     * If present, this attribute allows for batch processing and the identification of the 
     * 					record that failed amongst a group of records. This value may contain a concatenation of a unique failed 
     * 					transaction ID with specific record(s) associated with that transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecordID()
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * If present, this attribute refers to an online description of the error that occurred.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocURL() {
        return docURL;
    }

    /**
     * Sets the value of the docURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocURL()
     */
    public void setDocURL(String value) {
        this.docURL = value;
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
