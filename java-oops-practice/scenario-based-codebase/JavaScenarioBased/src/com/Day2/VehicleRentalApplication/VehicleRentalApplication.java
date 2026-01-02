package com.Day2.VehicleRentalApplication;

public class VehicleRentalApplication {

    public static void main(String[] args) {

        Customer customer = new Customer("Ayush");

        Rentable bike = new Bike("BIKE-101");
        Rentable car = new Car("CAR-202");
        Rentable truck = new Truck("TRUCK-303");

        int days = 3;

        System.out.println("Customer: " + customer.getName());

        System.out.println("\n Rental Details");
        System.out.println("Bike Rent: ₹" + bike.calculateRent(days));
        System.out.println("Car Rent: ₹" + car.calculateRent(days));
        System.out.println("Truck Rent: ₹" + truck.calculateRent(days));
    }
}
