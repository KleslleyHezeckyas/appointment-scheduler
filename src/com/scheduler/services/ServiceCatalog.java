package com.scheduler.services;

import com.scheduler.entities.ServiceType;
import java.util.ArrayList;
import java.util.List;

public class ServiceCatalog {

    private List<ServiceType> services = new ArrayList<>();

    public ServiceCatalog() {
        services.add(new ServiceType(1, "Corte de cabelo", 30.0));
        services.add(new ServiceType(2, "Barba", 20.0));
        services.add(new ServiceType(3, "Corte + Barba", 45.0)); // corrigido o ID
    }

    public List<ServiceType> listServices() {
        return services;
    }

    public ServiceType findById(int id) {
        for (ServiceType s : services) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}
