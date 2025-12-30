package com.constructorsandaccessmodifiers;

public class CarRental {

    // Instance variables
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constant rent per day (same for all rentals)
    private static final double RENT_PER_DAY = 1500.0;

    // 1️⃣ Default Constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // 2️⃣ Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * RENT_PER_DAY;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    // Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        System.out.println();

        // Using parameterized constructor
        CarRental rental2 =
                new CarRental("Ayush Mishra", "SUV", 4);
        rental2.displayRentalDetails();
    }
}