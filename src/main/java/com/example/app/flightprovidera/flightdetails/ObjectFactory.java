
package com.example.app.flightprovidera.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.app.flightprovidera.flightdetails package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ApplicationResults_QNAME = new QName("http://services.sabre.com/STL/v01", "ApplicationResults");
    private static final QName _Results_QNAME = new QName("http://services.sabre.com/STL/v01", "Results");
    private static final QName _STLPayload_QNAME = new QName("http://services.sabre.com/STL/v01", "STL_Payload");
    private static final QName _ProblemInformation_QNAME = new QName("http://services.sabre.com/STL/v01", "ProblemInformation");
    private static final QName _Diagnostics_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Diagnostics");
    private static final QName _Identification_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Identification");
    private static final QName _ResultSummary_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "ResultSummary");
    private static final QName _Security_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Security");
    private static final QName _Service_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Service");
    private static final QName _Traces_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "Traces");
    private static final QName _SabreHeader_QNAME = new QName("http://services.sabre.com/STL_Header/v120", "SabreHeader");
    private static final QName _CPAId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "CPAId");
    private static final QName _ConversationId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "ConversationId");
    private static final QName _Action_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Action");
    private static final QName _MessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "MessageId");
    private static final QName _Timestamp_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timestamp");
    private static final QName _RefToMessageId_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "RefToMessageId");
    private static final QName _TimeToLive_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "TimeToLive");
    private static final QName _Timeout_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "Timeout");
    private static final QName _DuplicateElimination_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "DuplicateElimination");
    private static final QName _SequenceNumber_QNAME = new QName("http://www.ebxml.org/namespaces/messageHeader", "SequenceNumber");
    private static final QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private static final QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private static final QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private static final QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private static final QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private static final QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private static final QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private static final QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private static final QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private static final QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private static final QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private static final QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private static final QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private static final QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private static final QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private static final QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private static final QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private static final QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private static final QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private static final QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private static final QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private static final QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private static final QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private static final QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    private static final QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    private static final QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    private static final QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    private static final QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private static final QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private static final QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private static final QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private static final QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private static final QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private static final QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private static final QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.app.flightprovidera.flightdetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ }
     */
    public OTAAirFlifoRQ createOTAAirFlifoRQ() {
        return new OTAAirFlifoRQ();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS }
     */
    public OTAAirFlifoRS createOTAAirFlifoRS() {
        return new OTAAirFlifoRS();
    }

    /**
     * Create an instance of {@link Security2 }
     * 
     * @return
     *     the new instance of {@link Security2 }
     */
    public Security2 createSecurity2() {
        return new Security2();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo }
     */
    public OTAAirFlifoRS.FlightInfo createOTAAirFlifoRSFlightInfo() {
        return new OTAAirFlifoRS.FlightInfo();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo }
     */
    public OTAAirFlifoRS.FlightInfo.ScheduledInfo createOTAAirFlifoRSFlightInfoScheduledInfo() {
        return new OTAAirFlifoRS.FlightInfo.ScheduledInfo();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg }
     */
    public OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg createOTAAirFlifoRSFlightInfoScheduledInfoFlightLeg() {
        return new OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo }
     */
    public OTAAirFlifoRS.FlightInfo.ActualInfo createOTAAirFlifoRSFlightInfoActualInfo() {
        return new OTAAirFlifoRS.FlightInfo.ActualInfo();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg }
     */
    public OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg createOTAAirFlifoRSFlightInfoActualInfoFlightLeg() {
        return new OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ.OriginDestinationInformation }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ.OriginDestinationInformation }
     */
    public OTAAirFlifoRQ.OriginDestinationInformation createOTAAirFlifoRQOriginDestinationInformation() {
        return new OTAAirFlifoRQ.OriginDestinationInformation();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment }
     */
    public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment createOTAAirFlifoRQOriginDestinationInformationFlightSegment() {
        return new OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment();
    }

    /**
     * Create an instance of {@link ApplicationResults }
     * 
     * @return
     *     the new instance of {@link ApplicationResults }
     */
    public ApplicationResults createApplicationResults() {
        return new ApplicationResults();
    }

    /**
     * Create an instance of {@link Results }
     * 
     * @return
     *     the new instance of {@link Results }
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link STLPayload }
     * 
     * @return
     *     the new instance of {@link STLPayload }
     */
    public STLPayload createSTLPayload() {
        return new STLPayload();
    }

    /**
     * Create an instance of {@link ProblemInformation }
     * 
     * @return
     *     the new instance of {@link ProblemInformation }
     */
    public ProblemInformation createProblemInformation() {
        return new ProblemInformation();
    }

    /**
     * Create an instance of {@link SystemSpecificResults }
     * 
     * @return
     *     the new instance of {@link SystemSpecificResults }
     */
    public SystemSpecificResults createSystemSpecificResults() {
        return new SystemSpecificResults();
    }

    /**
     * Create an instance of {@link HostCommand }
     * 
     * @return
     *     the new instance of {@link HostCommand }
     */
    public HostCommand createHostCommand() {
        return new HostCommand();
    }

    /**
     * Create an instance of {@link Diagnostics }
     * 
     * @return
     *     the new instance of {@link Diagnostics }
     */
    public Diagnostics createDiagnostics() {
        return new Diagnostics();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     * @return
     *     the new instance of {@link Identification }
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link ResultSummary }
     * 
     * @return
     *     the new instance of {@link ResultSummary }
     */
    public ResultSummary createResultSummary() {
        return new ResultSummary();
    }

    /**
     * Create an instance of {@link Security }
     * 
     * @return
     *     the new instance of {@link Security }
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link Service }
     * 
     * @return
     *     the new instance of {@link Service }
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Traces }
     * 
     * @return
     *     the new instance of {@link Traces }
     */
    public Traces createTraces() {
        return new Traces();
    }

    /**
     * Create an instance of {@link SabreHeader }
     * 
     * @return
     *     the new instance of {@link SabreHeader }
     */
    public SabreHeader createSabreHeader() {
        return new SabreHeader();
    }

    /**
     * Create an instance of {@link DiagnosticResults }
     * 
     * @return
     *     the new instance of {@link DiagnosticResults }
     */
    public DiagnosticResults createDiagnosticResults() {
        return new DiagnosticResults();
    }

    /**
     * Create an instance of {@link IdentifierSystem }
     * 
     * @return
     *     the new instance of {@link IdentifierSystem }
     */
    public IdentifierSystem createIdentifierSystem() {
        return new IdentifierSystem();
    }

    /**
     * Create an instance of {@link MessageCondition }
     * 
     * @return
     *     the new instance of {@link MessageCondition }
     */
    public MessageCondition createMessageCondition() {
        return new MessageCondition();
    }

    /**
     * Create an instance of {@link ProblemBase }
     * 
     * @return
     *     the new instance of {@link ProblemBase }
     */
    public ProblemBase createProblemBase() {
        return new ProblemBase();
    }

    /**
     * Create an instance of {@link ProblemSummary }
     * 
     * @return
     *     the new instance of {@link ProblemSummary }
     */
    public ProblemSummary createProblemSummary() {
        return new ProblemSummary();
    }

    /**
     * Create an instance of {@link TraceRecord }
     * 
     * @return
     *     the new instance of {@link TraceRecord }
     */
    public TraceRecord createTraceRecord() {
        return new TraceRecord();
    }

    /**
     * Create an instance of {@link TrackingID }
     * 
     * @return
     *     the new instance of {@link TrackingID }
     */
    public TrackingID createTrackingID() {
        return new TrackingID();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     * @return
     *     the new instance of {@link Manifest }
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     * @return
     *     the new instance of {@link Reference }
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link Schema }
     * 
     * @return
     *     the new instance of {@link Schema }
     */
    public Schema createSchema() {
        return new Schema();
    }

    /**
     * Create an instance of {@link Description }
     * 
     * @return
     *     the new instance of {@link Description }
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     * @return
     *     the new instance of {@link MessageHeader }
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link From }
     * 
     * @return
     *     the new instance of {@link From }
     */
    public From createFrom() {
        return new From();
    }

    /**
     * Create an instance of {@link PartyId }
     * 
     * @return
     *     the new instance of {@link PartyId }
     */
    public PartyId createPartyId() {
        return new PartyId();
    }

    /**
     * Create an instance of {@link To }
     * 
     * @return
     *     the new instance of {@link To }
     */
    public To createTo() {
        return new To();
    }

    /**
     * Create an instance of {@link Service2 }
     * 
     * @return
     *     the new instance of {@link Service2 }
     */
    public Service2 createService2() {
        return new Service2();
    }

    /**
     * Create an instance of {@link MessageData }
     * 
     * @return
     *     the new instance of {@link MessageData }
     */
    public MessageData createMessageData() {
        return new MessageData();
    }

    /**
     * Create an instance of {@link SyncReply }
     * 
     * @return
     *     the new instance of {@link SyncReply }
     */
    public SyncReply createSyncReply() {
        return new SyncReply();
    }

    /**
     * Create an instance of {@link MessageOrder }
     * 
     * @return
     *     the new instance of {@link MessageOrder }
     */
    public MessageOrder createMessageOrder() {
        return new MessageOrder();
    }

    /**
     * Create an instance of {@link SequenceNumberType }
     * 
     * @return
     *     the new instance of {@link SequenceNumberType }
     */
    public SequenceNumberType createSequenceNumberType() {
        return new SequenceNumberType();
    }

    /**
     * Create an instance of {@link AckRequested }
     * 
     * @return
     *     the new instance of {@link AckRequested }
     */
    public AckRequested createAckRequested() {
        return new AckRequested();
    }

    /**
     * Create an instance of {@link Acknowledgment }
     * 
     * @return
     *     the new instance of {@link Acknowledgment }
     */
    public Acknowledgment createAcknowledgment() {
        return new Acknowledgment();
    }

    /**
     * Create an instance of {@link ErrorList }
     * 
     * @return
     *     the new instance of {@link ErrorList }
     */
    public ErrorList createErrorList() {
        return new ErrorList();
    }

    /**
     * Create an instance of {@link Error }
     * 
     * @return
     *     the new instance of {@link Error }
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     * @return
     *     the new instance of {@link StatusResponse }
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link StatusRequest }
     * 
     * @return
     *     the new instance of {@link StatusRequest }
     */
    public StatusRequest createStatusRequest() {
        return new StatusRequest();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     * @return
     *     the new instance of {@link SignatureType }
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     * @return
     *     the new instance of {@link SignatureValueType }
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     * @return
     *     the new instance of {@link SignedInfoType }
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     * @return
     *     the new instance of {@link CanonicalizationMethodType }
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     * @return
     *     the new instance of {@link SignatureMethodType }
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     * @return
     *     the new instance of {@link ReferenceType }
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     * @return
     *     the new instance of {@link TransformsType }
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     * @return
     *     the new instance of {@link TransformType }
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     * @return
     *     the new instance of {@link DigestMethodType }
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     * @return
     *     the new instance of {@link KeyInfoType }
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     * @return
     *     the new instance of {@link KeyValueType }
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     * @return
     *     the new instance of {@link RetrievalMethodType }
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     * @return
     *     the new instance of {@link X509DataType }
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     * @return
     *     the new instance of {@link PGPDataType }
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     * @return
     *     the new instance of {@link SPKIDataType }
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     * @return
     *     the new instance of {@link ObjectType }
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     * @return
     *     the new instance of {@link ManifestType }
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     * @return
     *     the new instance of {@link SignaturePropertiesType }
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     * @return
     *     the new instance of {@link SignaturePropertyType }
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     * @return
     *     the new instance of {@link DSAKeyValueType }
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     * @return
     *     the new instance of {@link RSAKeyValueType }
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     * @return
     *     the new instance of {@link X509IssuerSerialType }
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     * @return
     *     the new instance of {@link Envelope }
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Header }
     * 
     * @return
     *     the new instance of {@link Header }
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Body }
     * 
     * @return
     *     the new instance of {@link Body }
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     * @return
     *     the new instance of {@link Fault }
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     * @return
     *     the new instance of {@link Detail }
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link Security2 .UsernameToken }
     * 
     * @return
     *     the new instance of {@link Security2 .UsernameToken }
     */
    public Security2 .UsernameToken createSecurity2UsernameToken() {
        return new Security2 .UsernameToken();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime }
     */
    public OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime createOTAAirFlifoRSFlightInfoScheduledInfoFlightLegArrivalDateTime() {
        return new OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime }
     */
    public OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime createOTAAirFlifoRSFlightInfoScheduledInfoFlightLegDepartureDateTime() {
        return new OTAAirFlifoRS.FlightInfo.ScheduledInfo.FlightLeg.DepartureDateTime();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime }
     */
    public OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime createOTAAirFlifoRSFlightInfoActualInfoFlightLegArrivalDateTime() {
        return new OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime }
     */
    public OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime createOTAAirFlifoRSFlightInfoActualInfoFlightLegDepartureDateTime() {
        return new OTAAirFlifoRS.FlightInfo.ActualInfo.FlightLeg.DepartureDateTime();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation }
     */
    public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation createOTAAirFlifoRQOriginDestinationInformationFlightSegmentDestinationLocation() {
        return new OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.DestinationLocation();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline }
     */
    public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline createOTAAirFlifoRQOriginDestinationInformationFlightSegmentMarketingAirline() {
        return new OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.MarketingAirline();
    }

    /**
     * Create an instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
     * 
     * @return
     *     the new instance of {@link OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation }
     */
    public OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation createOTAAirFlifoRQOriginDestinationInformationFlightSegmentOriginLocation() {
        return new OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.OriginLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "ApplicationResults", substitutionHeadNamespace = "http://services.sabre.com/STL/v01", substitutionHeadName = "Results")
    public JAXBElement<ApplicationResults> createApplicationResults(ApplicationResults value) {
        return new JAXBElement<>(_ApplicationResults_QNAME, ApplicationResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Results }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Results }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "Results")
    public JAXBElement<Results> createResults(Results value) {
        return new JAXBElement<>(_Results_QNAME, Results.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "STL_Payload")
    public JAXBElement<STLPayload> createSTLPayload(STLPayload value) {
        return new JAXBElement<>(_STLPayload_QNAME, STLPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL/v01", name = "ProblemInformation")
    public JAXBElement<ProblemInformation> createProblemInformation(ProblemInformation value) {
        return new JAXBElement<>(_ProblemInformation_QNAME, ProblemInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Diagnostics")
    public JAXBElement<Diagnostics> createDiagnostics(Diagnostics value) {
        return new JAXBElement<>(_Diagnostics_QNAME, Diagnostics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Identification }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Identification")
    public JAXBElement<Identification> createIdentification(Identification value) {
        return new JAXBElement<>(_Identification_QNAME, Identification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "ResultSummary")
    public JAXBElement<ResultSummary> createResultSummary(ResultSummary value) {
        return new JAXBElement<>(_ResultSummary_QNAME, ResultSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Security }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Security")
    public JAXBElement<Security> createSecurity(Security value) {
        return new JAXBElement<>(_Security_QNAME, Security.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Service }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Traces }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Traces }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "Traces")
    public JAXBElement<Traces> createTraces(Traces value) {
        return new JAXBElement<>(_Traces_QNAME, Traces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SabreHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SabreHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Header/v120", name = "SabreHeader")
    public JAXBElement<SabreHeader> createSabreHeader(SabreHeader value) {
        return new JAXBElement<>(_SabreHeader_QNAME, SabreHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "CPAId")
    public JAXBElement<String> createCPAId(String value) {
        return new JAXBElement<>(_CPAId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "ConversationId")
    public JAXBElement<String> createConversationId(String value) {
        return new JAXBElement<>(_ConversationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<>(_Action_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Timestamp")
    public JAXBElement<String> createTimestamp(String value) {
        return new JAXBElement<>(_Timestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "RefToMessageId")
    public JAXBElement<String> createRefToMessageId(String value) {
        return new JAXBElement<>(_RefToMessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "TimeToLive")
    public JAXBElement<XMLGregorianCalendar> createTimeToLive(XMLGregorianCalendar value) {
        return new JAXBElement<>(_TimeToLive_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "Timeout")
    public JAXBElement<BigInteger> createTimeout(BigInteger value) {
        return new JAXBElement<>(_Timeout_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "DuplicateElimination")
    public JAXBElement<Object> createDuplicateElimination(Object value) {
        return new JAXBElement<>(_DuplicateElimination_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceNumberType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SequenceNumberType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ebxml.org/namespaces/messageHeader", name = "SequenceNumber")
    public JAXBElement<SequenceNumberType> createSequenceNumber(SequenceNumberType value) {
        return new JAXBElement<>(_SequenceNumber_QNAME, SequenceNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<>(_Envelope_QNAME, Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Header }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Body }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<>(_Body_QNAME, Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

}
