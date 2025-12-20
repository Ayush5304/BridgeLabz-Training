import java.util.Scanner;
public class UnitConvertor{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}

    public static void main(String[] args) {

        System.out.println("5 km in miles: " +
                UnitConvertor.convertKmToMiles(5));

        System.out.println("3 miles in km: " +
                UnitConvertor.convertMilesToKm(3));

        System.out.println("2 meters in feet: " +
                UnitConvertor.convertMetersToFeet(2));

        System.out.println("10 feet in meters: " +
                UnitConvertor.convertFeetToMeters(10));
    }

