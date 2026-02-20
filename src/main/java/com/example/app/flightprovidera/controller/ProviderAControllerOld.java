package com.example.app.flightprovidera.controller;

import com.example.app.flightprovidera.service.ProviderAService;
import com.example.app.flightprovidera.service.SearchRequest;
import com.example.app.flightprovidera.service.SearchResult;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/providerA")
public class ProviderAControllerOld {

    private final ProviderAService providerAService;

    public ProviderAControllerOld(ProviderAService providerAService) {
        this.providerAService = providerAService;
    }

    @GetMapping("/flightsAvailable")
    public SearchResult getFlightsAvailable(
            @RequestParam String origin,
            @RequestParam String destination,
            @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime departureDate
    ) {
        return providerAService.getFlightsAvailable(origin, destination, departureDate);
    }

    @PostMapping("/flightsAvailable")
    public SearchResult postFlightsAvailable(
            @RequestBody SearchRequest searchRequest
    ){
        return providerAService.postFlightsAvailable(searchRequest);
    }
}
