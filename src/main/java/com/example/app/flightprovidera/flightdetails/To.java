
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element ref="{http://www.ebxml.org/namespaces/messageHeader}PartyId" maxOccurs="unbounded"/>
 *         <element name="Role" type="{http://www.ebxml.org/namespaces/messageHeader}non-empty-string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partyId",
    "role"
})
@XmlRootElement(name = "To", namespace = "http://www.ebxml.org/namespaces/messageHeader")
public class To {

    @XmlElement(name = "PartyId", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    protected List<PartyId> partyId;
    @XmlElement(name = "Role", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    protected String role;

    /**
     * Gets the value of the partyId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyId }
     * </p>
     * 
     * 
     * @return
     *     The value of the partyId property.
     */
    public List<PartyId> getPartyId() {
        if (partyId == null) {
            partyId = new ArrayList<>();
        }
        return this.partyId;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

}
