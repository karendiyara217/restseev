package com.transport.service;
import com.transport.model.Bus;
import com.transport.model.repository.BusRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransportService {
    private final BusRepository busRepository;

    public TransportService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }
}