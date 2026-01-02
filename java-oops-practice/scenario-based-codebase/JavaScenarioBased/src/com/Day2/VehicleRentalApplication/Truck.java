package com.Day2.VehicleRentalApplication;
class Truck extends Vehicle implements Rentable {

    private double loadCharge = 1000;

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1500);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }
}
