import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {

            System.out.print("Enter age (or -1 to exit) ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote");
                System.out.print("Vote for candidate (1 / 2 / 3) ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    vote1++;
                } else if (vote == 2) {
                    vote2++;
                } else if (vote == 3) {
                    vote3++;
                } else {
                    System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("You are NOT eligible to vote");
            }
        }

        // Display results
        System.out.println("Election Results");
        System.out.println("Candidate 1 Votes " + vote1);
        System.out.println("Candidate 2 Votes " + vote2);
        System.out.println("Candidate 3 Votes " + vote3);

    }
}
