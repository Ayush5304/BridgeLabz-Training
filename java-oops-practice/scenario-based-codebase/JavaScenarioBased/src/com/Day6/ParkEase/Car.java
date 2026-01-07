package com.Day6.ParkEase;

class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); 
    }

    @Override
    public double calculateCharges(int hours) {
        return baseRate * hours;
    }
}
