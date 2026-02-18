package com.AssessmentProblems.TravelBookingSystem;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TravelUtil tu = new TravelUtil();

        System.out.println("Enter booking details");
        String input = sc.nextLine();

        String[] parts = input.split(":");

        if(parts.length != 4) {
            System.out.println("invalid input");
            return;
        }

        try {
            String customerName = parts[0];
            String packageName = parts[1];
            int numberOfDays = Integer.parseInt(parts[2]);
            String season = parts[3];

            double output =
                tu.finalBill(packageName, season, numberOfDays);

            System.out.println(
              "Total booking price for the customer: " + output);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

