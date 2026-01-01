package com.encapsulationandpolymorphism.RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingTest {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Rahul"));
        vehicles.add(new Bike("BIKE202", "Amit"));
        vehicles.add(new Auto("AUTO303", "Suresh"));

        FareService.calculateRideFare(vehicles, 12);
    }
}
