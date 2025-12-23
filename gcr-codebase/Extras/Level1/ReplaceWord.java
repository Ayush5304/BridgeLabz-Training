import java.util.Scanner;

public class ReplaceWord{

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace");
        String oldWord = sc.next();

        System.out.print("Enter new word");
        String newWord = sc.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);


    }
}
