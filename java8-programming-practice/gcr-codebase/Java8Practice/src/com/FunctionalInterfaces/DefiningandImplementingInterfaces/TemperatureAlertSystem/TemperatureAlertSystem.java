package com.FunctionalInterfaces.DefiningandImplementingInterfaces.TemperatureAlertSystem;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        double currentTemp = 38.5;

        Predicate<Double> highTempAlert =
                temp -> temp > 37.0;

        if (highTempAlert.test(currentTemp)) {
            System.out.println(" ALERT: High Temperature! (" + currentTemp + "°C)");
        } else {
            System.out.println(" Temperature Normal: " + currentTemp + "°C");
        }
    }
}
