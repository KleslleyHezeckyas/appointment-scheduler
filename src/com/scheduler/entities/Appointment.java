package com.scheduler.entities;

import java.time.LocalDateTime;

public class Appointment {
private int id;
private Client client;
private ServiceType service;
private LocalDateTime dateTime;

public Appointment(int id, Client client, ServiceType service, LocalDateTime dateTime){
    this.id = id;
    this.client = client;
    this.service = service;
    this.dateTime = dateTime;
}

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public ServiceType getService() {
        return service;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", client=" + client +
                ", service=" + service +
                ", dateTime=" + dateTime +
                '}';
    }
}
