package com.Day7.TourMate;

public class TourMateApp {

    public static void main(String[] args) {

        Transport flight = new Transport(15000);
        Hotel hotel = new Hotel(10000);
        Activity sightseeing = new Activity(5000);

        Trip domesticTrip = new DomesticTrip( "Goa", 5, flight, hotel, sightseeing);

        Trip internationalTrip = new InternationalTrip("Paris", 7, flight, hotel, sightseeing );

        domesticTrip.book();
        System.out.println();

        internationalTrip.book();
    }
}
