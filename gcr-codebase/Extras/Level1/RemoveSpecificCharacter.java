import java.util.Scanner;

public class RemoveSpecificCharacter{

    // Method to remove a specific character from string
    public static String removeCharacter(String input, char removeChar) {

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Append character only if it is not the one to remove
            if (ch != removeChar) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter the string");
        String input = sc.nextLine();

        // Take character to remove
        System.out.print("Enter the character to remove");
        char removeChar = sc.next().charAt(0);

        // Call method
        String modifiedString = removeCharacter(input, removeChar);

        // Display result
        System.out.println("Modified String: \"" + modifiedString + "\"");

    }
}
