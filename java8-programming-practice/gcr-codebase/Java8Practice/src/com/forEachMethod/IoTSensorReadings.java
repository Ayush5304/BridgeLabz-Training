package com.forEachMethod;

import java.util.*;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
                22.5, 30.1, 45.6, 18.2, 55.9, 27.4, 60.0
        );

        double threshold = 30.0;

        System.out.println(" Sensor Readings Above Threshold (" + threshold + "):\n");

        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading -> 
                          System.out.println("Reading: " + reading)
                      );
    }
}
