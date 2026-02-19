
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationResults complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplicationResults">
 *   <complexContent>
 *     <extension base="{http://services.sabre.com/STL/v01}Results">
 *       <sequence>
 *         <element name="Success" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/>
 *         <element name="Error" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/>
 *         <element name="Warning" type="{http://services.sabre.com/STL/v01}ProblemInformation" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="status" use="required" type="{http://services.sabre.com/STL_Header/v120}CompletionCodes" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", propOrder = {
    "success",
    "error",
    "warning"
})
public class ApplicationResults
    extends Results
{

    @XmlElement(name = "Success")
    protected List<ProblemInformation> success;
    @XmlElement(name = "Error")
    protected List<ProblemInformation> error;
    @XmlElement(name = "Warning")
    protected List<ProblemInformation> warning;
    @XmlAttribute(name = "status", required = true)
    protected CompletionCodes status;

    /**
     * Gets the value of the success property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the success property.
     */
    public List<ProblemInformation> getSuccess() {
        if (success == null) {
            success = new ArrayList<>();
        }
        return this.success;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<ProblemInformation> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblemInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the warning property.
     */
    public List<ProblemInformation> getWarning() {
        if (warning == null) {
            warning = new ArrayList<>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the status property.
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
     */
    public void setStatus(CompletionCodes value) {
        this.status = value;
    }

}
