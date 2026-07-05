package com.example.tourism_info_portal.model;

public class Task {

    private Long id;
    private String destination;
    private String country;
    private int price;
    private int duration;

    public Task() {
    }

    public Task(Long id,
                String destination,
                String country,
                int price,
                int duration) {
        this.id = id;
        this.destination = destination;
        this.country = country;
        this.price = price;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}