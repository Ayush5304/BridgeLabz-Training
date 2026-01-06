package com.Day5.EventEase;

public class EventEaseApp {

    public static void main(String[] args) {

        User organizer = new User("Ayush", "ayush@gmail.com", "9999999999");

        Event birthday = new BirthdayEvent( "Ayush Birthday","Bhopal", "15-Aug-2026",50, 15000,5000 );

        Event conference = new ConferenceEvent( "Tech Conference", "Indore", "10-Sep-2026", 200, 50000, 20000);

        birthday.schedule();
        System.out.println("Total Cost: ₹" + birthday.calculateTotalCost());

        System.out.println();

        conference.schedule();
        conference.reschedule("12-Sep-2026");
        System.out.println("Total Cost: ₹" + conference.calculateTotalCost());
    }
}
