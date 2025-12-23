import java.util.Scanner;

public class CompareStrings{

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
            // Return ASCII difference
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        // If all characters match, compare lengths
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input strings
        System.out.print("Enter first string");
        String s1 = sc.nextLine();

        System.out.print("Enter second string");
        String s2 = sc.nextLine();

        // Compare strings
        int result = compareStrings(s1, s2);

        // Display result
        if (result == 0) {
            System.out.println("Both strings are equal");
        } 
        else if (result < 0) {
            System.out.println("String 1 comes before String 2");
        } 
        else {
            System.out.println("String 1 comes after String 2");
        }
    }
}
