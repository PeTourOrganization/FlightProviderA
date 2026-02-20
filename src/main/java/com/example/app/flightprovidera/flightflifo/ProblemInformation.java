
package com.example.app.flightprovidera.flightflifo;

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
 * <p>Java class for ProblemInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProblemInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SystemSpecificResults" type="{http://services.sabre.com/STL/v01}SystemSpecificResults" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" type="{http://services.sabre.com/STL_Header/v120}ErrorType" />
 *       <attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemInformation", namespace = "http://services.sabre.com/STL/v01", propOrder = {
    "systemSpecificResults"
})
public class ProblemInformation {

    @XmlElement(name = "SystemSpecificResults")
    protected List<SystemSpecificResults> systemSpecificResults;
    /**
     * An indication of the source of error when processing the request.
     * 
     */
    @XmlAttribute(name = "type")
    protected ErrorType type;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the systemSpecificResults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemSpecificResults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSystemSpecificResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemSpecificResults }
     * </p>
     * 
     * 
     * @return
     *     The value of the systemSpecificResults property.
     */
    public List<SystemSpecificResults> getSystemSpecificResults() {
        if (systemSpecificResults == null) {
            systemSpecificResults = new ArrayList<>();
        }
        return this.systemSpecificResults;
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
