package com.example.app.flightprovidera.controller;

import com.example.app.flightprovidera.service.SearchRequest;
import com.example.app.flightprovidera.service.SearchResult;
import com.example.app.flightprovidera.service.SearchService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProviderAEndPoint {
    private static final String NAMESPACE_URI = "http://localhost:8081/flights";
    private final SearchService searchService;

    public ProviderAEndPoint(SearchService searchService) {
        this.searchService = searchService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchRequest")
    @ResponsePayload
    public SearchResult getFlightsAvailable(@RequestPayload SearchRequest searchRequest) {
        return searchService.availabilitySearch(searchRequest);
    }

}
