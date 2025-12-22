import java.util.Scanner;

class CharacterFrequencyNestedLoop{

    // Method to find character frequency using nested loops
    public static String[] findCharacterFrequency(String text) {

        // Convert string to character array
        char[] chars = text.toCharArray();
        int length = chars.length;

        // Array to store frequency
        int[] freq = new int[length];

        // Find frequency using nested loops
        for (int i=0; i<length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        //  Count unique characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Find character frequency
        String[] frequencyResult = findCharacterFrequency(text);

        // Display result
        System.out.println("Character Frequency");
        System.out.println("");

        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i]);
        }
    }
}
