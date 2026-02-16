package com.AssessmentProblems.TrainSeat;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten-digit alphanumeric booking ID: ");
        String input = sc.nextLine();

        BookingDecoder decoder = new BookingDecoder(input);
        decoder.decodeBooking();

    }
}