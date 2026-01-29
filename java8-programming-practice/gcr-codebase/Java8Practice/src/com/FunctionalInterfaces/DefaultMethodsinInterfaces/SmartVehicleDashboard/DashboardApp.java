package com.FunctionalInterfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;

public class DashboardApp {
    public static void main(String[] args) {

        Vehicle v1 = new PetrolCar();
        v1.displaySpeed();
        v1.displayBattery();

        System.out.println();

        Vehicle v2 = new ElectricCar();
        v2.displaySpeed();
        v2.displayBattery();
    }
}
