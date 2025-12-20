import java.util.Scanner;
public class UnitConvertorClass {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter farhenheit");
        double farhenheit = sc.nextDouble();
        System.out.println(" Fahrenheit to Celsius = " +
                UnitConvertorClass.convertFarhenheitToCelsius(farhenheit));

        System.out.print("Enter celsius");
        double celsius = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit = " +
                UnitConvertorClass.convertCelsiusToFarhenheit(celsius));

        System.out.print("Enter pounds");
        double pounds = sc.nextDouble();
        System.out.println("Pounds to Kilograms = " +
                UnitConvertorClass.convertPoundsToKilograms(pounds));

        System.out.print("Enter kilograms");
        double kilograms= sc.nextDouble();
        System.out.println(" Kilograms to Pounds = " +
                UnitConvertorClass.convertKilogramsToPounds(kilograms));

        System.out.print("Enter gallons");
        double gallons = sc.nextDouble();
        System.out.println("Gallons to Liters = " +
                UnitConvertorClass.convertGallonsToLiters(gallons));

        System.out.print("Enter liters");
        double liters = sc.nextDouble();
        System.out.println(" Liters to Gallons = " +
                UnitConvertorClass.convertLitersToGallons(liters));
    }

