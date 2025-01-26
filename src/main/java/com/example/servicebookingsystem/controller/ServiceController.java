package com.example.servicebookingsystem.controller;

import com.example.servicebookingsystem.model.Service;
import com.example.servicebookingsystem.repository.ServiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ServiceRepository serviceRepository;

    public ServiceController(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @GetMapping
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    @PostMapping
    public Service addService(@RequestBody Service service) {
        return serviceRepository.save(service);
    }
}
