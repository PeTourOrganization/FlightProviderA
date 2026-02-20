package com.example.app.flightprovidera.service;

import com.example.app.flightprovidera.flightavail.From;
import com.example.app.flightprovidera.flightavail.MessageHeader;
import com.example.app.flightprovidera.flightavail.OTAAirAvailService;
import com.example.app.flightprovidera.flightavail.PartyId;
import com.example.app.flightprovidera.flightavail.*;
import com.example.app.flightprovidera.flightavail.Security2;
import com.example.app.flightprovidera.flightavail.To;
import com.example.app.flightprovidera.flightavail.OTAAirAvailRQ.*;
import com.example.app.flightprovidera.flightavail.OTAAirAvailRQ.OriginDestinationInformation.*;
import com.example.app.flightprovidera.flightavail.OTAAirAvailRQ.OriginDestinationInformation.FlightSegment.*;


//import com.example.app.flightprovidera.flightflifo.*;
//import com.example.app.flightprovidera.flightflifo.OTAAirFlifoRQ.*;
//import com.example.app.flightprovidera.flightflifo.OTAAirFlifoRQ.OriginDestinationInformation.*;
//import com.example.app.flightprovidera.flightflifo.OTAAirFlifoRQ.OriginDestinationInformation.FlightSegment.*;

import jakarta.xml.ws.Holder;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProviderAService {

    public String flightsAvailable(String origin, String destination, LocalDateTime departureDate) {
        var from = new From();
        var fromPartyId = new PartyId();
        fromPartyId.setValue("WebServiceClient");
        from.getPartyId().add(fromPartyId);

        var to = new To();
        var toPartyId = new PartyId();
        toPartyId.setValue("Sabre_Web_Services");
        to.getPartyId().add(toPartyId);

        var messageHeader = new MessageHeader();
        messageHeader.setFrom(from);
        messageHeader.setTo(to);
        messageHeader.setConversationId("1234567890");

        var messageHolder = new Holder<MessageHeader>();
        messageHolder.value = messageHeader;

        var security2 = new Security2();
        Security2.UsernameToken usernameToken = new Security2.UsernameToken();
        usernameToken.setUsername("8btonmrhfr2pcm7d");
        usernameToken.setPassword("a8rL2DwG");
        usernameToken.setOrganization("SabreDevStudio");
        security2.setUsernameToken(usernameToken);

        var securityHolder = new Holder<Security2>();
        securityHolder.value = security2;

        var body = new OTAAirAvailRQ();
        FlightSegment flightSegment = getFlightSegment(origin, destination, departureDate);
        OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
        originDestinationInformation.setFlightSegment(flightSegment);
        body.setOriginDestinationInformation(originDestinationInformation);

        var otaAirAvail = new OTAAirAvailService().getOTAAirAvailPortType();
        otaAirAvail.otaAirAvailRQ(
                messageHolder,
                securityHolder,
                body
        );
        return "ok";
    }


    public String flightsAvailableOld(String origin, String destination, LocalDateTime departureDate) {
//        var from = new From();
//        var fromPartyId = new PartyId();
//        fromPartyId.setValue("WebServiceClient");
//        from.getPartyId().add(fromPartyId);
//
//        var to = new To();
//        var toPartyId = new PartyId();
//        toPartyId.setValue("Sabre_Web_Services");
//        to.getPartyId().add(toPartyId);
//
//
//
//        var messageHeader = new MessageHeader();
//        messageHeader.setFrom(from);
//        messageHeader.setTo(to);
//        messageHeader.setConversationId("1234567890");
//
//        Holder<MessageHeader> messageHolder = new Holder<>();
//        messageHolder.value = messageHeader;
//
//        Security2 security2 = new Security2();
//        Security2.UsernameToken usernameToken = new Security2.UsernameToken();
//        usernameToken.setUsername("8btonmrhfr2pcm7d");
//        usernameToken.setPassword("a8rL2DwG");
//        security2.setUsernameToken(usernameToken);
//
//        Holder<Security2> securityHolder = new Holder<>();
//        securityHolder.value = security2;
//
//        OTAAirFlifoRQ body = new OTAAirFlifoRQ();
//        FlightSegment flightSegment = getFlightSegment(origin, destination, departureDate);
//        OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
//        originDestinationInformation.setFlightSegment(flightSegment);
//        body.setOriginDestinationInformation(originDestinationInformation);
//
//        var otaAir = new OTAAirFlifoService().getOTAAirFlifoPortType();
//        otaAir.otaAirFlifoRQ(messageHolder, securityHolder, body);
////        var seg = otaAir.getFlightSegment();
////        var flightNumber = seg.getFlightNumber();
////        var loc = seg.getDestinationLocation();
////        return loc.getLocationCode();
        return "ok";
    }

    private static @NonNull FlightSegment getFlightSegment(String origin, String destination, LocalDateTime departureDate) {
        FlightSegment flightSegment = new FlightSegment();
        OriginLocation originLocation = new OriginLocation();
        DestinationLocation destinationLocation = new DestinationLocation();
        destinationLocation.setLocationCode(destination);
        originLocation.setLocationCode(origin);
        flightSegment.setOriginLocation(originLocation);
        flightSegment.setDepartureDateTime(departureDate.toString());
        flightSegment.setDestinationLocation(destinationLocation);
        return flightSegment;
    }



}
