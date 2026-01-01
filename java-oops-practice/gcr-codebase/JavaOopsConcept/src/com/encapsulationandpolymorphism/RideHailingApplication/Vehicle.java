package com.encapsulationandpolymorphism.RideHailingApplication;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm; // accessible to subclasses

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (Getters only)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per KM: ₹" + ratePerKm);
    }
}
