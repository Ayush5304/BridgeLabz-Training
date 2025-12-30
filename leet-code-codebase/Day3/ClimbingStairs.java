import java.util.Scanner;

public class ClimbingStairs{

    public static int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int prev1 = 2;
        int prev2 = 1;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        System.out.println("Number of ways: " + climbStairs(n));

        sc.close();
    }
}
