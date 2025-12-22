import java.util.Scanner;

class IllegalArgumentDemo{

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        // Setting start index greater than end index
        // This will cause IllegalArgumentException
        System.out.println("Substring" + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // Again using invalid substring indexes
            System.out.println("Substring" + text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("Exception caught: IllegalArgumentException occurred!");
            System.out.println("Reason: Start index is greater than end index");
        }
        catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("Runtime Exception caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a text ");
        String text = sc.next();

        // First call generates exception 
        // generateException(text);

        // Refactored call handles exception safely
        handleException(text);
    }
}
