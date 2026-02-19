
package com.example.app.flightprovidera.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * System identifier used to uniquily identify the specific system.
 *  	"Source" is used to return the application name responsible for fulfilling the particular request transaction.
 * 	"ApplicationInstance" is used to return the application instance responsible for fulfilling the particular request transaction.
 * 	"Cluster" is used to return the application cluster responsible for fulfilling the particular request transaction.
 * 	"HostName" is used to return the particular server name responsible for fulfilling the particular request transaction.
 * 	 Example: Source ApplicationInstance="PROD1" Cluster="PROD TPF SCC" HostName="PSS" TPF Source
 * 
 * <p>Java class for Identifier.System complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Identifier.System">
 *   <simpleContent>
 *     <extension base="<http://services.sabre.com/STL_Header/v120>Identifier">
 *       <attribute name="instance" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="cluster" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="host" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       <attribute name="uri" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier.System", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "value"
})
public class IdentifierSystem {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "instance")
    protected String instance;
    @XmlAttribute(name = "cluster")
    protected String cluster;
    @XmlAttribute(name = "host")
    protected String host;
    /**
     * The uri representing the endpoint reference by which this system can be accessed.
     * 
     */
    @XmlAttribute(name = "uri")
    protected String uri;

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
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * Gets the value of the cluster property.
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
     */
    public void setCluster(String value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the host property.
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
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * The uri representing the endpoint reference by which this system can be accessed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUri()
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
