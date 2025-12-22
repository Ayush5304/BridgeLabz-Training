import java.util.Scanner;

class CharacterFrequency{

    // Method to find frequency of characters and return 2D array
    public static String[][] findCharacterFrequency(String text) {

        //Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch]; 
            }
        }

        // Create 2D array for result
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Reset frequency array and count again
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; 
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text");
        String text = sc.nextLine();

        // Find character frequencies
        String[][] frequencyData = findCharacterFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        System.out.println("");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(
                frequencyData[i][0] + "\t\t" + frequencyData[i][1]
            );
        }
    }
}
