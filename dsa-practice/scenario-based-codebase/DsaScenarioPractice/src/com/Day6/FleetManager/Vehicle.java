package com.Day6.FleetManager;

public class Vehicle {
    String vehicleId;
    int mileage;

    public Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " (" + mileage + " km)";
    }
}
