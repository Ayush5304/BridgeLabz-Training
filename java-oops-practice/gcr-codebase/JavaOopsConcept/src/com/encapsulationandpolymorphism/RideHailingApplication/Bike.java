package com.encapsulationandpolymorphism.RideHailingApplication;
public class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(String id, String driverName) {
        super(id, driverName, 8); // ₹8 per km
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
