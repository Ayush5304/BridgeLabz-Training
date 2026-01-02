package com.Day2.VehicleRentalApplication;

class Car extends Vehicle implements Rentable {

    private double luxuryCharge = 500;

    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge;
    }
}
