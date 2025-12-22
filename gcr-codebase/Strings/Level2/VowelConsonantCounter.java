import java.util.Scanner;

class VowelConsonantCounter{

    // Method to check if character is Vowel, Consonant or Not a Letter
    public static String checkVowelOrConsonant(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkVowelOrConsonant(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Store counts in array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Number of Vowels " + counts[0]);
        System.out.println("Number of Consonants" + counts[1]);
    }
}
