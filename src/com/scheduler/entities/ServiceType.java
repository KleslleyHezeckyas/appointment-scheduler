package com.scheduler.entities;

public class ServiceType {

    private int id;
    private String description;
    private Double price;

    public ServiceType(int id, String description, Double price){
        this.id = id;
        this.description = description;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
