
package com.example.app.flightprovidera.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Record for all systems (consumer, proxies and gateways, providers) to use to trace the message. 
 * 			The value is the common system name.
 * 
 * <p>Java class for TraceRecord complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TraceRecord">
 *   <simpleContent>
 *     <extension base="<http://services.sabre.com/STL_Header/v120>Identifier">
 *       <attribute name="key" type="{http://services.sabre.com/STL_Header/v120}Text.Long" />
 *       <attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="appInstance" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="cluster" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="host" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="targetURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="role" type="{http://services.sabre.com/STL_Header/v120}TraceRole" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceRecord", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "value"
})
public class TraceRecord {

    @XmlValue
    protected String value;
    /**
     * The key attribute is similar to ConversationID but is provided by the service requestor or entrypoint gateway and 
     * 							must be unique across all Sabre gateways. Each gateway instance must prepend the ID value with its unique system identifier. 
     * 							Internal service consumers must provide this value which may be their unique system identifier concantanated 
     * 							with the ConversationID.
     * 
     */
    @XmlAttribute(name = "key")
    protected String key;
    /**
     * When the system stated processing the message.
     * 
     */
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    /**
     * When the system completed processing the message. 
     * 						Example: 2002-10-10T12:00:00+05:00.
     * 
     */
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    /**
     * The application instance involved in the particular transaction. 
     * 						For example: PROD1
     * 
     */
    @XmlAttribute(name = "appInstance")
    protected String appInstance;
    /**
     * The application server cluster involved in the particular transaction. 
     * 						Example: PROD TPFC SCC
     * 
     */
    @XmlAttribute(name = "cluster")
    protected String cluster;
    /**
     * The server name involved in the particular transaction. 
     * 						Example: PSS
     * 
     */
    @XmlAttribute(name = "host")
    protected String host;
    /**
     * The targetURI is the endpoint address this system sent the message to. 
     * 						For ServiceProviders it should be the abstract service address which is the address used by 
     * 						registries to look up the actual service endpoint URI. The endpoint address may be a queue
     * 						name (MOM service name).
     * 
     */
    @XmlAttribute(name = "targetURI")
    @XmlSchemaType(name = "anyURI")
    protected String targetURI;
    @XmlAttribute(name = "role")
    protected TraceRole role;

    /**
     * Gets the value of the value property.
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
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The key attribute is similar to ConversationID but is provided by the service requestor or entrypoint gateway and 
     * 							must be unique across all Sabre gateways. Each gateway instance must prepend the ID value with its unique system identifier. 
     * 							Internal service consumers must provide this value which may be their unique system identifier concantanated 
     * 							with the ConversationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * When the system stated processing the message.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStart()
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * When the system completed processing the message. 
     * 						Example: 2002-10-10T12:00:00+05:00.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEnd()
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * The application instance involved in the particular transaction. 
     * 						For example: PROD1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInstance() {
        return appInstance;
    }

    /**
     * Sets the value of the appInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppInstance()
     */
    public void setAppInstance(String value) {
        this.appInstance = value;
    }

    /**
     * The application server cluster involved in the particular transaction. 
     * 						Example: PROD TPFC SCC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCluster()
     */
    public void setCluster(String value) {
        this.cluster = value;
    }

    /**
     * The server name involved in the particular transaction. 
     * 						Example: PSS
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHost()
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * The targetURI is the endpoint address this system sent the message to. 
     * 						For ServiceProviders it should be the abstract service address which is the address used by 
     * 						registries to look up the actual service endpoint URI. The endpoint address may be a queue
     * 						name (MOM service name).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetURI() {
        return targetURI;
    }

    /**
     * Sets the value of the targetURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTargetURI()
     */
    public void setTargetURI(String value) {
        this.targetURI = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TraceRole }
     *     
     */
    public TraceRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceRole }
     *     
     */
    public void setRole(TraceRole value) {
        this.role = value;
    }

}
