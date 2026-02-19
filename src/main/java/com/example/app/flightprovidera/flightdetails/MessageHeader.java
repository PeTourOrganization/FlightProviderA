
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}From"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}To"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}CPAId"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}ConversationId"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}Service"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}Action"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}MessageData"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}DuplicateElimination" minOccurs="0"/>
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.ebxml.org/namespaces/messageHeader}headerExtension.grp"/>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "from",
    "to",
    "cpaId",
    "conversationId",
    "service",
    "action",
    "messageData",
    "duplicateElimination",
    "description",
    "any"
})
@XmlRootElement(name = "MessageHeader", namespace = "http://www.ebxml.org/namespaces/messageHeader")
public class MessageHeader {

    @XmlElement(name = "From", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected From from;
    @XmlElement(name = "To", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected To to;
    @XmlElement(name = "CPAId", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String cpaId;
    @XmlElement(name = "ConversationId", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String conversationId;
    @XmlElement(name = "Service", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected Service2 service;
    @XmlElement(name = "Action", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String action;
    @XmlElement(name = "MessageData", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected MessageData messageData;
    @XmlElement(name = "DuplicateElimination", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected Object duplicateElimination;
    @XmlElement(name = "Description", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected List<Description> description;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected String version;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link From }
     *     
     */
    public From getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link From }
     *     
     */
    public void setFrom(From value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link To }
     *     
     */
    public To getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link To }
     *     
     */
    public void setTo(To value) {
        this.to = value;
    }

    /**
     * Gets the value of the cpaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPAId() {
        return cpaId;
    }

    /**
     * Sets the value of the cpaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPAId(String value) {
        this.cpaId = value;
    }

    /**
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(String value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service2 }
     *     
     */
    public Service2 getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service2 }
     *     
     */
    public void setService(Service2 value) {
        this.service = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link MessageData }
     *     
     */
    public MessageData getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageData }
     *     
     */
    public void setMessageData(MessageData value) {
        this.messageData = value;
    }

    /**
     * Gets the value of the duplicateElimination property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDuplicateElimination() {
        return duplicateElimination;
    }

    /**
     * Sets the value of the duplicateElimination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDuplicateElimination(Object value) {
        this.duplicateElimination = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * </p>
     * 
     * 
     * @return
     *     The value of the description property.
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
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
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
