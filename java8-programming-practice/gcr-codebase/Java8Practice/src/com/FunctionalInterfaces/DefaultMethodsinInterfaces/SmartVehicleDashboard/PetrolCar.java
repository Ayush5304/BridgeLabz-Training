package com.FunctionalInterfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;

class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85% ");
    }
}
