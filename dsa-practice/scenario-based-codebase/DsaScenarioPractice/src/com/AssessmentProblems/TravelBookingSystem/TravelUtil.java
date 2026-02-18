
package com.AssessmentProblems.TravelBookingSystem;

public class TravelUtil {

    public double finalBill(String packageName,
                            String season,
                            int numberOfDays) {

        if(numberOfDays <= 0)
            throw new IllegalArgumentException("Invalid number of days");

        double basePrice;

        switch(packageName) {
            case "P123": basePrice = 5000; break;
            case "P223": basePrice = 10000; break;
            case "P345": basePrice = 12000; break;
            default:
                throw new IllegalArgumentException("Invalid package");
        }

        double additionalCharge;

        switch(season) {
            case "season":
                additionalCharge = basePrice * 0.15;
                break;
            case "peakseason":
                additionalCharge = basePrice * 0.25;
                break;
            case "offseason":
                additionalCharge = basePrice * 0.10;
                break;
            default:
                throw new IllegalArgumentException("Invalid season");
        }

        if(numberOfDays >= 7) {
            return basePrice * 0.90 + additionalCharge;
        }

        return basePrice + additionalCharge;
    }
}
