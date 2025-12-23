import java.util.Scanner;

public class LongestWord{

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence){

    // Split sentence into words
        String[] words = sentence.split(" ");

        String longestWord = "";
        for (int i = 0; i < words.length; i++) {

    // If current word is longer than previous longest
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    // Take sentence input
        System.out.print("Enter a sentence");
        String sentence = sc.nextLine();

    // method call
        String result = findLongestWord(sentence);

        System.out.println("Longest word in the sentence" + result);
    }
}
