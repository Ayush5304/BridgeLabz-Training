import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo{

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Accessing index beyond array length
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println("Name at invalid index" + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Again accessing index beyond array length
            System.out.println("Name at invalid index " + names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handling specific exception
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(" Index is outside the array bounds");
        }
        catch (RuntimeException e) {
            // Handling generic runtime exception
            System.out.println("Runtime Exception caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of names");
        int n = sc.nextInt();

        // Create array of names
        String[] names = new String[n];

        // Take names input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1));
            names[i] = sc.next();
        }

        //  generates exception (commented to avoid crash)
        // generateException(names);

        //  handles runtime exception safely
        handleException(names);
    }
}
