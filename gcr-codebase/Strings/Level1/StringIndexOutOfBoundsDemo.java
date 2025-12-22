import java.util.Scanner;

class StringIndexOutOfBoundsDemo{

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond string length
        // This will throw StringIndexOutOfBoundsException
        System.out.println("Character at invalid index " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Accessing index beyond string length
            System.out.println("Character at invalid index" + text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println(" StringIndexOutOfBoundsException occurred");
            System.out.println(" Index is greater than or equal to string length");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a text ");
        String text = sc.next();

        handleException(text);
    }
}
