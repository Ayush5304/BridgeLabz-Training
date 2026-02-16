package com.AssessmentProblems.CarPro;

import java.text.SimpleDateFormat;
import java.util.*;

public class UserInterface {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        System.out.println("Enter number of bookings to be added");
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Date> map = new HashMap<>();

        System.out.println("Enter the Booking details (Booking Id:Date of Booking)");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            String bookingId = parts[0];
            Date date = sdf.parse(parts[1]);

            map.put(bookingId, date);
        }

        BookCabMain obj = new BookCabMain();
        obj.setBookingMap(map);

        System.out.println("Enter the date to check the booking");
        Date searchDate = sdf.parse(sc.nextLine());

        List<String> ids = obj.findCabBookingIdsForTheBookingDate(searchDate);

        if (ids.isEmpty()) {
            System.out.println("No bookings were booked");
        } else {
            System.out.println("Booking Ids booked on the " + sdf.format(searchDate) + " are by");
            for (String id : ids) {
                System.out.println(id);
            }
        }
    }
}
