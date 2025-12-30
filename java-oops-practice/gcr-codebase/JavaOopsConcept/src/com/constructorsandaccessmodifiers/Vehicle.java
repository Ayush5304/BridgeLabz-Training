package com.constructorsandaccessmodifiers;

public class Vehicle {

    // Instance variables (unique for each vehicle)
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 2500.0;

    // Parameterized Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ayush Mishra", "Car");
        Vehicle v2 = new Vehicle("Rohit Sharma", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(3000.0);

        System.out.println("After updating registration fee:\n");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
    }
}