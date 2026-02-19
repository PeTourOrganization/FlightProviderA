
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Traces complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Traces">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trace" type="{http://services.sabre.com/STL_Header/v120}TraceRecord" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traces", namespace = "http://services.sabre.com/STL_Header/v120", propOrder = {
    "trace"
})
public class Traces {

    @XmlElement(name = "Trace")
    protected List<TraceRecord> trace;

    /**
     * Gets the value of the trace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraceRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the trace property.
     */
    public List<TraceRecord> getTrace() {
        if (trace == null) {
            trace = new ArrayList<>();
        }
        return this.trace;
    }

}
