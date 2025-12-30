import java.util.Scanner;

public class SquareRoot{

    public static int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } 
            else if (square < x) {
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Square root (rounded down): " + mySqrt(x));

    }
}
