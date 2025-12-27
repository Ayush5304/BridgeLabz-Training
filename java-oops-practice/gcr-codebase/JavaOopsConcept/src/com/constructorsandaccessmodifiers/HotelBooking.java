package com.constructorsandaccessmodifiers;

public class HotelBooking {

    // Instance variables
    private String guestName;
    private String roomType;
    private int nights;

    // 1️⃣ Default Constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // 2️⃣ Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // 3️⃣ Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

    // Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingDetails();

        System.out.println();

        // Using parameterized constructor
        HotelBooking booking2 =
                new HotelBooking("Ayush Mishra", "Deluxe", 3);
        booking2.displayBookingDetails();

        System.out.println();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingDetails();
    }
}

