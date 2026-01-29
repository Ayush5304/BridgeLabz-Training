package com.FunctionalInterfaces.DefiningandImplementingInterfaces.StringLengthChecker;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        String message = "Your appointment is confirmed at 5 PM.";

        Function<String, Integer> lengthCalculator =
                String::length;

        int length = lengthCalculator.apply(message);

        System.out.println("Message Length: " + length);

        if (length > 30) {
            System.out.println(" Warning: Message exceeds character limit!");
        } else {
            System.out.println(" Message length OK");
        }
    }
}
