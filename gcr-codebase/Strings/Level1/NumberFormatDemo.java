import java.util.Scanner;

class NumberFormatDemo{

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        // Trying to convert non-numeric text to integer
        // This will throw NumberFormatException
        int number = Integer.parseInt(text);

        System.out.println("Number is " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            // Trying to convert text to integer
            int number = Integer.parseInt(text);
            System.out.println("Number is " + number);
        }
        catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println(" NumberFormatException occurred!");
            System.out.println(" Input text is not a valid number");
        }
        catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("Runtime Exception caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input as String
        System.out.print("Enter a value ");
        String text = sc.next();

       //safely handles runtime exception
        handleException(text);
    }
}
