package com.example.servicebookingsystem.service;

import com.example.servicebookingsystem.model.Service;
import com.example.servicebookingsystem.repository.ServiceRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Service> getAllServices() {  // Use renamed ServiceModel class
        return serviceRepository.findAll();
    }

    public Service addService(Service service) {  // Use renamed ServiceModel class
        return serviceRepository.save(service);
    }
}
