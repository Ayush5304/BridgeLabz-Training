package com.encapsulationandpolymorphism.RideHailingApplication;

public class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(String id, String driverName) {
        super(id, driverName, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) + 20;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
