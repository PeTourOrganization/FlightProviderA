package com.example.app.flightprovidera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providerA")
public class ProviderAController {

    @GetMapping("/flightsAvailable")
    public String getFlightsAvailable() {
        return "Flights Available";
    }
}
