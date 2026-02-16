package com.AssessmentProblems.TrainSeat;

import java.util.*;

class BookingDecoder {

    private String bookingId;

    public BookingDecoder(String bookingId) {
        this.bookingId = bookingId;
    }

    public void decodeBooking() {

        if(bookingId == null || bookingId.length() != 10) {
            System.out.println("Invalid Input");
            return;
        }

        String seatCountStr = bookingId.substring(5, 7);

        if(!seatCountStr.matches("[0-1][0-9]")) {
            System.out.println("Invalid Count");
            return;
        }

        int seatCount = Integer.parseInt(seatCountStr);

        if(seatCount < 1 || seatCount > 10) {
            System.out.println("Invalid Count");
            return;
        }

        char coach = bookingId.charAt(7);

        String startSeatStr = bookingId.substring(8, 10);

        if(!Character.isLetter(coach) || !startSeatStr.matches("[0-9]{2}")) {
            System.out.println("Invalid Seat Number");
            return;
        }

        int startSeat = Integer.parseInt(startSeatStr);

        for(int i=0; i<seatCount; i++) {
            System.out.println(coach + String.format("%02d", startSeat + i));
        }
    }
}

