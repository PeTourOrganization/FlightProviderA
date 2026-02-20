package com.example.app.flightprovidera.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class ProviderAService {

    public SearchResult getFlightsAvailable(
            String origin, String destination, LocalDateTime departureDate
    ) {
        var request = new SearchRequest(origin, destination, departureDate);
        return new SearchService().availabilitySearch(request);
    }

    public SearchResult postFlightsAvailable(SearchRequest searchRequest) {
        return new SearchService().availabilitySearch(searchRequest);
    }


}
