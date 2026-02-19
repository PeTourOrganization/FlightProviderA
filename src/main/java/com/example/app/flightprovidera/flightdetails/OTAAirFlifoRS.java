
package com.example.app.flightprovidera.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         <element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/>
 *         <element name="FlightInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ActualInfo" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ArrivalDateTime" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="OnGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="OnRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="DepartureDateTime" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="OffGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="OffRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       <element name="TimeOfCreation" type="{http://webservices.sabre.com/sabreXML/2011/10}time" minOccurs="0"/>
 *                                     </sequence>
 *                                     <attribute name="EntryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ScheduledInfo" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ArrivalDateTime" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="BaggageClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="DepartureDateTime" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                               <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     </sequence>
 *                                     <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                 <attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationResults",
    "flightInfo"
})
@XmlRootElement(name = "OTA_AirFlifoRS", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class OTAAirFlifoRS {

    /**
     * ApplicationResults can be used anywhere where Results is referenced, specifically as
     * 				the contents of a Sabre SOAP Fault/detail element.
     * 
     */
    @XmlElement(name = "ApplicationResults", namespace = "http://services.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "FlightInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
    protected OTAAirFlifoRS.FlightInfo flightInfo;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * ApplicationResults can be used anywhere where Results is referenced, specifically as
     * 				the contents of a Sabre SOAP Fault/detail element.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     * @see #getApplicationResults()
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the flightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirFlifoRS.FlightInfo }
     *     
     */
    public OTAAirFlifoRS.FlightInfo getFlightInfo() {
        return flightInfo;
    }

    /**
     * Sets the value of the flightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirFlifoRS.FlightInfo }
     *     
     */
    public void setFlightInfo(OTAAirFlifoRS.FlightInfo value) {
        this.flightInfo = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ActualInfo" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ArrivalDateTime" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="OnGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="OnRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="DepartureDateTime" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="OffGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="OffRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                             <element name="TimeOfCreation" type="{http://webservices.sabre.com/sabreXML/2011/10}time" minOccurs="0"/>
     *                           </sequence>
     *                           <attribute name="EntryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ScheduledInfo" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ArrivalDateTime" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="BaggageClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="DepartureDateTime" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                                     <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           </sequence>
     *                           <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *       <attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actualInfo",
        "scheduledInfo"
    })
    public static class FlightInfo {

        @XmlElement(name = "ActualInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected OTAAirFlifoRS.FlightInfo.ActualInfo actualInfo;
        @XmlElement(name = "ScheduledInfo", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
        protected OTAAirFlifoRS.FlightInfo.ScheduledInfo scheduledInfo;
        @XmlAttribute(name = "AirlineCode")
        protected String airlineCode;
        @XmlAttribute(name = "DepartureDateTime")
        protected String departureDateTime;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;

        /**
         * Gets the value of the actualInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo }
         *     
         */
        public OTAAirFlifoRS.FlightInfo.ActualInfo getActualInfo() {
            return actualInfo;
        }

        /**
         * Sets the value of the actualInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo }
         *     
         */
        public void setActualInfo(OTAAirFlifoRS.FlightInfo.ActualInfo value) {
            this.actualInfo = value;
        }

        /**
         * Gets the value of the scheduledInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo }
         *     
         */
        public OTAAirFlifoRS.FlightInfo.ScheduledInfo getScheduledInfo() {
            return scheduledInfo;
        }

        /**
         * Sets the value of the scheduledInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo }
         *     
         */
        public void setScheduledInfo(OTAAirFlifoRS.FlightInfo.ScheduledInfo value) {
            this.scheduledInfo = value;
        }

        /**
         * Gets the value of the airlineCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineCode() {
            return airlineCode;
        }

        /**
         * Sets the value of the airlineCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineCode(String value) {
            this.airlineCode = value;
        }

        /**
         * Gets the value of the departureDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureDateTime() {
            return departureDateTime;
        }

        /**
         * Sets the value of the departureDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureDateTime(String value) {
            this.departureDateTime = value;
        }

        /**
         * Gets the value of the flightNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNumber() {
            return flightNumber;
        }

        /**
         * Sets the value of the flightNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNumber(String value) {
            this.flightNumber = value;
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
         *         <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ArrivalDateTime" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="OnGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="OnRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="DepartureDateTime" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="OffGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="OffRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                   <element name="TimeOfCreation" type="{http://webservices.sabre.com/sabreXML/2011/10}time" minOccurs="0"/>
         *                 </sequence>
         *                 <attribute name="EntryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "flightLeg"
        })
        public static class ActualInfo {

            @XmlElement(name = "FlightLeg", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg> flightLeg;

            /**
             * Gets the value of the flightLeg property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightLeg property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getFlightLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg }
             * </p>
             * 
             * 
             * @return
             *     The value of the flightLeg property.
             */
            public List<OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg> getFlightLeg() {
                if (flightLeg == null) {
                    flightLeg = new ArrayList<>();
                }
                return this.flightLeg;
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
             *         <element name="ArrivalDateTime" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="OnGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="OnRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="DepartureDateTime" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="OffGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="OffRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *         <element name="TimeOfCreation" type="{http://webservices.sabre.com/sabreXML/2011/10}time" minOccurs="0"/>
             *       </sequence>
             *       <attribute name="EntryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "arrivalDateTime",
                "departureDateTime",
                "text",
                "timeOfCreation"
            })
            public static class FlightLeg {

                @XmlElement(name = "ArrivalDateTime", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime arrivalDateTime;
                @XmlElement(name = "DepartureDateTime", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime departureDateTime;
                @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<String> text;
                @XmlElement(name = "TimeOfCreation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected String timeOfCreation;
                @XmlAttribute(name = "EntryIdentifier")
                protected String entryIdentifier;
                @XmlAttribute(name = "LocationCode")
                protected String locationCode;

                /**
                 * Gets the value of the arrivalDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime }
                 *     
                 */
                public OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime getArrivalDateTime() {
                    return arrivalDateTime;
                }

                /**
                 * Sets the value of the arrivalDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime }
                 *     
                 */
                public void setArrivalDateTime(OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime value) {
                    this.arrivalDateTime = value;
                }

                /**
                 * Gets the value of the departureDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime }
                 *     
                 */
                public OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * Sets the value of the departureDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime }
                 *     
                 */
                public void setDepartureDateTime(OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime value) {
                    this.departureDateTime = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getText().add(newItem);
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
                 *     The value of the text property.
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<>();
                    }
                    return this.text;
                }

                /**
                 * Gets the value of the timeOfCreation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeOfCreation() {
                    return timeOfCreation;
                }

                /**
                 * Sets the value of the timeOfCreation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeOfCreation(String value) {
                    this.timeOfCreation = value;
                }

                /**
                 * Gets the value of the entryIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntryIdentifier() {
                    return entryIdentifier;
                }

                /**
                 * Sets the value of the entryIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntryIdentifier(String value) {
                    this.entryIdentifier = value;
                }

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
                 *       <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="OnGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="OnRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ArrivalDateTime {

                    @XmlAttribute(name = "Actual")
                    protected String actual;
                    @XmlAttribute(name = "Estimated")
                    protected String estimated;
                    @XmlAttribute(name = "OnGate")
                    protected String onGate;
                    @XmlAttribute(name = "OnRunway")
                    protected String onRunway;

                    /**
                     * Gets the value of the actual property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActual() {
                        return actual;
                    }

                    /**
                     * Sets the value of the actual property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setActual(String value) {
                        this.actual = value;
                    }

                    /**
                     * Gets the value of the estimated property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEstimated() {
                        return estimated;
                    }

                    /**
                     * Sets the value of the estimated property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEstimated(String value) {
                        this.estimated = value;
                    }

                    /**
                     * Gets the value of the onGate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnGate() {
                        return onGate;
                    }

                    /**
                     * Sets the value of the onGate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnGate(String value) {
                        this.onGate = value;
                    }

                    /**
                     * Gets the value of the onRunway property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOnRunway() {
                        return onRunway;
                    }

                    /**
                     * Sets the value of the onRunway property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOnRunway(String value) {
                        this.onRunway = value;
                    }

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
                 *       <attribute name="Actual" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="Estimated" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="OffGate" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="OffRunway" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DepartureDateTime {

                    @XmlAttribute(name = "Actual")
                    protected String actual;
                    @XmlAttribute(name = "Estimated")
                    protected String estimated;
                    @XmlAttribute(name = "OffGate")
                    protected String offGate;
                    @XmlAttribute(name = "OffRunway")
                    protected String offRunway;

                    /**
                     * Gets the value of the actual property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActual() {
                        return actual;
                    }

                    /**
                     * Sets the value of the actual property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setActual(String value) {
                        this.actual = value;
                    }

                    /**
                     * Gets the value of the estimated property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEstimated() {
                        return estimated;
                    }

                    /**
                     * Sets the value of the estimated property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEstimated(String value) {
                        this.estimated = value;
                    }

                    /**
                     * Gets the value of the offGate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOffGate() {
                        return offGate;
                    }

                    /**
                     * Sets the value of the offGate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOffGate(String value) {
                        this.offGate = value;
                    }

                    /**
                     * Gets the value of the offRunway property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOffRunway() {
                        return offRunway;
                    }

                    /**
                     * Sets the value of the offRunway property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOffRunway(String value) {
                        this.offRunway = value;
                    }

                }

            }

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
         *         <element name="FlightLeg" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ArrivalDateTime" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="BaggageClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="DepartureDateTime" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                           <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 </sequence>
         *                 <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "flightLeg"
        })
        public static class ScheduledInfo {

            @XmlElement(name = "FlightLeg", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected List<OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg> flightLeg;

            /**
             * Gets the value of the flightLeg property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightLeg property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getFlightLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg }
             * </p>
             * 
             * 
             * @return
             *     The value of the flightLeg property.
             */
            public List<OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg> getFlightLeg() {
                if (flightLeg == null) {
                    flightLeg = new ArrayList<>();
                }
                return this.flightLeg;
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
             *         <element name="ArrivalDateTime" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="BaggageClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="DepartureDateTime" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *                 <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       </sequence>
             *       <attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "arrivalDateTime",
                "departureDateTime",
                "text"
            })
            public static class FlightLeg {

                @XmlElement(name = "ArrivalDateTime", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime arrivalDateTime;
                @XmlElement(name = "DepartureDateTime", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime departureDateTime;
                @XmlElement(name = "Text", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
                protected List<String> text;
                @XmlAttribute(name = "LocationCode")
                protected String locationCode;

                /**
                 * Gets the value of the arrivalDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime }
                 *     
                 */
                public OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime getArrivalDateTime() {
                    return arrivalDateTime;
                }

                /**
                 * Sets the value of the arrivalDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime }
                 *     
                 */
                public void setArrivalDateTime(OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime value) {
                    this.arrivalDateTime = value;
                }

                /**
                 * Gets the value of the departureDateTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime }
                 *     
                 */
                public OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * Sets the value of the departureDateTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime }
                 *     
                 */
                public void setDepartureDateTime(OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime value) {
                    this.departureDateTime = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the text property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getText().add(newItem);
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
                 *     The value of the text property.
                 */
                public List<String> getText() {
                    if (text == null) {
                        text = new ArrayList<>();
                    }
                    return this.text;
                }

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
                 *       <attribute name="BaggageClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ArrivalDateTime {

                    @XmlAttribute(name = "BaggageClaim")
                    protected String baggageClaim;
                    @XmlAttribute(name = "Gate")
                    protected String gate;
                    @XmlAttribute(name = "Scheduled")
                    protected String scheduled;
                    @XmlAttribute(name = "Terminal")
                    protected String terminal;

                    /**
                     * Gets the value of the baggageClaim property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBaggageClaim() {
                        return baggageClaim;
                    }

                    /**
                     * Sets the value of the baggageClaim property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBaggageClaim(String value) {
                        this.baggageClaim = value;
                    }

                    /**
                     * Gets the value of the gate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGate() {
                        return gate;
                    }

                    /**
                     * Sets the value of the gate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGate(String value) {
                        this.gate = value;
                    }

                    /**
                     * Gets the value of the scheduled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScheduled() {
                        return scheduled;
                    }

                    /**
                     * Sets the value of the scheduled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScheduled(String value) {
                        this.scheduled = value;
                    }

                    /**
                     * Gets the value of the terminal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTerminal() {
                        return terminal;
                    }

                    /**
                     * Sets the value of the terminal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTerminal(String value) {
                        this.terminal = value;
                    }

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
                 *       <attribute name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       <attribute name="Scheduled" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
                 *       <attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DepartureDateTime {

                    @XmlAttribute(name = "Gate")
                    protected String gate;
                    @XmlAttribute(name = "Scheduled")
                    protected String scheduled;
                    @XmlAttribute(name = "Terminal")
                    protected String terminal;

                    /**
                     * Gets the value of the gate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGate() {
                        return gate;
                    }

                    /**
                     * Sets the value of the gate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGate(String value) {
                        this.gate = value;
                    }

                    /**
                     * Gets the value of the scheduled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getScheduled() {
                        return scheduled;
                    }

                    /**
                     * Sets the value of the scheduled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setScheduled(String value) {
                        this.scheduled = value;
                    }

                    /**
                     * Gets the value of the terminal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTerminal() {
                        return terminal;
                    }

                    /**
                     * Sets the value of the terminal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTerminal(String value) {
                        this.terminal = value;
                    }

                }

            }

        }

    }

}
