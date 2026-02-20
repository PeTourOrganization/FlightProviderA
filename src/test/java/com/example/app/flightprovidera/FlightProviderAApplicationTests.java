package com.example.app.flightprovidera;

import com.example.app.flightprovidera.service.SearchService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import java.util.Collections;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;
import static org.springframework.ws.test.server.ResponseMatchers.xpath;

@SpringBootTest
class FlightProviderAApplicationTests {

    private final ApplicationContext applicationContext;
    private MockWebServiceClient mockClient;

    private SearchService searchService;


    public FlightProviderAApplicationTests(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @BeforeEach
    public void generateClient(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }


    @Test
    public void testGetFlightsAvailableSuccess(){
        var requestPayload = new StringSource(
                "<flig:SearchRequest xmlns:flig='http://petour.com/flights'>" +
                        "   <flig:origin>IST</flig:origin>" +
                        "   <flig:destination>JFK</flig:destination>" +
                        "   <flig:departureDate>2026-05-25T09:00:00</flig:departureDate>" +
                        "</flig:SearchRequest>"
        );

        mockClient.sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(xpath("//ns3:hasError",
                        Collections.singletonMap("ns3", "http://petour.com/flights"))
                        .evaluatesTo(false));
    }



//    @Test
//    public void testWithMockedService() {
//        // Setup mock behavior
//        SearchResult mockResult = new SearchResult();
//        mockResult.setHasError(false);
//
//        when(searchService.availabilitySearch(any())).thenReturn(mockResult);
//
//        // ... send request as shown above ...
//    }


//    @Test
//    void contextLoads() {
//    }

}
