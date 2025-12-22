import java.util.Scanner;
class NullPointerDemo{

    // Method to generate NullPointerException
    public static void generateException() {

        // Declare a String variable and initialize it to null
        String text = null;

        // This line will cause NullPointerException
        // because we are calling a method on a null object
        System.out.println("Length of text" + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {

        // Declare a String variable and initialize it to null
        String text = null;

        try {
            // This will throw NullPointerException
            System.out.println("Length of text" + text.length());
        }
        catch (NullPointerException e) {
            // Handling the exception
            System.out.println(" NullPointerException occurred!");
            System.out.println("Trying to access a method on a null object");
        }
    }

    public static void main(String[] args) {
    handleException();
       
    }
}
