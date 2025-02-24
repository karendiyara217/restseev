package com.transport.controller;
import com.transport.model.Bus;
import com.transport.service.TransportService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transport")
public class TransportController {
    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping("/buses")
    public List<Bus> getAllBuses() {
        return transportService.getAllBuses();
    }
}