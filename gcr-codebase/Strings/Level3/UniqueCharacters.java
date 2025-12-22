import java.util.Scanner;

class UniqueCharacters{

    // Method to find length of string without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {

        int length = findLengthWithoutLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store in temp array
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create final array with exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display result
        System.out.println("Unique Characters");
        for (int i = 0; i<uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}
