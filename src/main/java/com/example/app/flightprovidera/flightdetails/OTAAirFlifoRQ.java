
package com.example.app.flightprovidera.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="OriginDestinationInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FlightSegment">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="DestinationLocation" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="MarketingAirline" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     <attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="OriginLocation" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                           <attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *       <attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.1.1" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "originDestinationInformation"
})
@XmlRootElement(name = "OTA_AirFlifoRQ", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
public class OTAAirFlifoRQ {

    @XmlElement(name = "OriginDestinationInformation", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
    protected OTAAirFlifoRQ.OriginDestinationInformation originDestinationInformation;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OTAAirFlifoRQ.OriginDestinationInformation }
     *     
     */
    public OTAAirFlifoRQ.OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * Sets the value of the originDestinationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAAirFlifoRQ.OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(OTAAirFlifoRQ.OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.1.1";
        } else {
            return version;
        }
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
     *         <element name="FlightSegment">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DestinationLocation" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="MarketingAirline" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           <attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="OriginLocation" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                 <attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "flightSegment"
    })
    public static class OriginDestinationInformation {

        /**
         * FlightNumber is required if MarketingAirline is not specified.
         *                                         When both are specified FlightNumber from MarketingAirline is used.
         * 
         */
        @XmlElement(name = "FlightSegment", namespace = "http://webservices.sabre.com/sabreXML/2011/10", required = true)
        protected OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment flightSegment;

        /**
         * FlightNumber is required if MarketingAirline is not specified.
         *                                         When both are specified FlightNumber from MarketingAirline is used.
         * 
         * @return
         *     possible object is
         *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment }
         *     
         */
        public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment getFlightSegment() {
            return flightSegment;
        }

        /**
         * Sets the value of the flightSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment }
         *     
         * @see #getFlightSegment()
         */
        public void setFlightSegment(OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment value) {
            this.flightSegment = value;
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
         *         <element name="DestinationLocation" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="MarketingAirline" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 <attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="OriginLocation" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *       <attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "destinationLocation",
            "marketingAirline",
            "originLocation"
        })
        public static class FlightSegment {

            @XmlElement(name = "DestinationLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation destinationLocation;
            @XmlElement(name = "MarketingAirline", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline marketingAirline;
            @XmlElement(name = "OriginLocation", namespace = "http://webservices.sabre.com/sabreXML/2011/10")
            protected OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation originLocation;
            @XmlAttribute(name = "DepartureDateTime")
            protected String departureDateTime;
            @XmlAttribute(name = "FlightNumber")
            protected BigInteger flightNumber;

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
             *     
             */
            public void setDestinationLocation(OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the marketingAirline property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline }
             *     
             */
            public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline getMarketingAirline() {
                return marketingAirline;
            }

            /**
             * Sets the value of the marketingAirline property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline }
             *     
             */
            public void setMarketingAirline(OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline value) {
                this.marketingAirline = value;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
             *     
             */
            public void setOriginLocation(OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation value) {
                this.originLocation = value;
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
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFlightNumber(BigInteger value) {
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
             *       <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DestinationLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

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
             *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       <attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MarketingAirline {

                @XmlAttribute(name = "Code", required = true)
                protected String code;
                @XmlAttribute(name = "FlightNumber", required = true)
                protected String flightNumber;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
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
             *       <attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OriginLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

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

            }

        }

    }

}
