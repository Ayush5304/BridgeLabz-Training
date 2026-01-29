package com.FunctionalInterfaces.DefiningandImplementingInterfaces.MultiVehicleRentalSystem;

public class RentalSystem {
    public static void main(String[] args) {

        Rentable[] vehicles = {
                new Car(),
                new Bike(),
                new Bus()
        };

        for (Rentable v : vehicles) {
            v.rent();
            v.returnVehicle();
        }
    }
}
