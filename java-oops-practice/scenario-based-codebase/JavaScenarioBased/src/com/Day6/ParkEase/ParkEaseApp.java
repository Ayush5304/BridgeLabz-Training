package com.Day6.ParkEase;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot carSlot = new ParkingSlot(101, "Car");

        Vehicle car = new Car("MP04-AB-1234");

        if (carSlot.assignSlot(car)) {
            System.out.println("Slot Assigned Successfully");

            int hours = 4;
            double charges = car.calculateCharges(hours);

            System.out.println("Parking Charges for " + hours + " hours: ₹" + charges);
            System.out.println("Slot Status: " + carSlot.getStatus());

            carSlot.releaseSlot();
        } else {
            System.out.println(" Slot Assignment Failed");
        }
    }
}
