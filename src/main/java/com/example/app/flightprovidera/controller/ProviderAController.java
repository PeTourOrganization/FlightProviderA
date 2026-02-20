package com.example.app.flightprovidera.controller;

import com.example.app.flightprovidera.service.ProviderAService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/providerA")
public class ProviderAController {

    private final ProviderAService providerAService;

    public ProviderAController(ProviderAService providerAService) {
        this.providerAService = providerAService;
    }

    @GetMapping("/flightsAvailable")
    public String getFlightsAvailable(
            @RequestParam String origin,
            @RequestParam String destination,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime departureDate
    ) {
        return providerAService.flightsAvailable(origin, destination, departureDate);
    }
}
