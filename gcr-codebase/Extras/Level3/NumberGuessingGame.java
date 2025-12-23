import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;
public class NumberGuessingGame{

    // Method to generate a random guess between min and max
    public static int generateGuess(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Method to get user feedback
    public static String getUserFeedback(Scanner sc) {
        System.out.print("Is the guess high, low, or correct");
        return sc.next().toLowerCase();
    }

    // Method to update range based on feedback
    public static int[] updateRange(int min, int max, int guess, String feedback) {

        if (feedback.equals("high")) {
            max = guess - 1;
        } 
        else if (feedback.equals("low")) {
            min = guess + 1;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100");
        System.out.println("I will try to guess it");

        while (!guessedCorrectly) {

            int guess = generateGuess(min, max);
            System.out.println("My guess is" + guess);

            String feedback = getUserFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println(" Yay! I guessed your number correctly");
                guessedCorrectly = true;
            } 
            else {
                int[] range = updateRange(min, max, guess, feedback);
                min = range[0];
                max = range[1];
            }
        }

    }
}
