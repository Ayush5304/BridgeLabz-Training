import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Correct answers (1,2,3,4 options)
        int[] correctAnswers = {1, 2, 1, 3, 1};

        System.out.println("Online Quiz Application");

        for (int i = 0; i < 5; i++) {

            switch (i) {

                case 0:
                    System.out.println("1. Java was developed in which year?");
                    System.out.println("1) 1991  2) 1995  3) 2000  4) 2005");
                    break;

                case 1:
                    System.out.println("2. Who invented Java?");
                    System.out.println("1) Dennis Ritchie  2) James Gosling  3) Bjarne Stroustrup  4) Guido van Rossum");
                    break;

                case 2:
                    System.out.println("3. Java was previously named as?");
                    System.out.println("1) Oak  2) Pine  3) Maple  4) Coffee");
                    break;

                case 3:
                    System.out.println("4. In which year Java was publicly released?");
                    System.out.println("1) 1991  2) 1993  3) 1995  4) 1997");
                    break;

                case 4:
                    System.out.println("5. Is Java an Object-Oriented Language?");
                    System.out.println("1) Yes  2) No");
                    break;
            }

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }

            System.out.println();
        }

        System.out.println(" Quiz Completed");
        System.out.println("Your Score: " + score + "/5");
    }
}
