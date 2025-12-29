import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 42;  
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println(" Welcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        // do-while loop runs at least once
        do {
            System.out.print("Enter your guess ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println(" Correct! You guessed it in " + attempts + " attempts");
                return; 
            }

        } while (attempts < maxAttempts);

        System.out.println("Game Over You've used all 5 attempts");
        System.out.println("The correct number was" + secretNumber);
    }
}
