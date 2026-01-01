package com.encapsulationandpolymorphism.RideHailingApplication;

import java.util.List;

public class FareService {

    public static void calculateRideFare(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: ₹" + v.calculateFare(distance));

            GPS gps = (GPS) v;
            gps.updateLocation("Bhopal");
            System.out.println("Current Location: " + gps.getCurrentLocation());

            System.out.println("");
        }
    }
}
