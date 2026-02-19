
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
 *         <element name="UsernameToken" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *                   <element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   <element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SabreAth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BinarySecurityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usernameToken",
    "sabreAth",
    "binarySecurityToken"
})
@XmlRootElement(name = "Security", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
public class Security2 {

    @XmlElement(name = "UsernameToken", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
    protected Security2 .UsernameToken usernameToken;
    @XmlElement(name = "SabreAth", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
    protected String sabreAth;
    @XmlElement(name = "BinarySecurityToken", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
    protected String binarySecurityToken;

    /**
     * Gets the value of the usernameToken property.
     * 
     * @return
     *     possible object is
     *     {@link Security2 .UsernameToken }
     *     
     */
    public Security2 .UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * Sets the value of the usernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security2 .UsernameToken }
     *     
     */
    public void setUsernameToken(Security2 .UsernameToken value) {
        this.usernameToken = value;
    }

    /**
     * Gets the value of the sabreAth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreAth() {
        return sabreAth;
    }

    /**
     * Sets the value of the sabreAth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreAth(String value) {
        this.sabreAth = value;
    }

    /**
     * Gets the value of the binarySecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinarySecurityToken() {
        return binarySecurityToken;
    }

    /**
     * Sets the value of the binarySecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinarySecurityToken(String value) {
        this.binarySecurityToken = value;
    }


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
     *         <element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
     *         <element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
     *         <element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
        "username",
        "password",
        "newPassword",
        "organization",
        "domain"
    })
    public static class UsernameToken {

        @XmlElement(name = "Username", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
        protected String username;
        @XmlElement(name = "Password", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
        protected String password;
        @XmlElement(name = "NewPassword", namespace = "http://schemas.xmlsoap.org/ws/2002/12/secext")
        protected List<String> newPassword;
        @XmlElement(name = "Organization", namespace = "")
        protected String organization;
        @XmlElement(name = "Domain", namespace = "")
        protected String domain;

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the newPassword property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newPassword property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNewPassword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the newPassword property.
         */
        public List<String> getNewPassword() {
            if (newPassword == null) {
                newPassword = new ArrayList<>();
            }
            return this.newPassword;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return domain;
        }

        /**
         * Sets the value of the domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.domain = value;
        }

    }

}
