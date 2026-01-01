package com.encapsulationandpolymorphism.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalTest {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-POL-001"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-POL-010"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-POL-999"));

        int days = 3;

        for (Vehicle v : vehicles) {

            v.displayDetails();
            System.out.println("Rental Cost for " + days + " days: ₹" + v.calculateRentalCost(days));

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: ₹" + ins.calculateInsurance(days));
            System.out.println(ins.getInsuranceDetails());

            System.out.println("");
        }
    }
}
