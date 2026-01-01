package com.encapsulationandpolymorphism.RideHailingApplication;

public class Car extends Vehicle implements GPS {

    private String location;

    public Car(String id, String driverName) {
        super(id, driverName, 15); // ₹15 per km
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
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
