package com.Day6.ParkEase;

class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        double penalty = (hours > 5) ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
