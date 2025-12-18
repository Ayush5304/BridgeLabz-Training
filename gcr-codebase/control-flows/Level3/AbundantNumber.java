import java.util.Scanner;

// a program to check if a number taken from the user is a Abundant Number.
public class AbundantNumber{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        int sum = 0;                 

        // take for loop
      for (int i=1; i<number; i++) {
          if(number%i==0){
		  sum+=i;
        }
	  }
        // Check if number is Abundant Number or not
        if (sum > number) {
            System.out.println(number + " is an Abundant Number  ");
        } else {
            System.out.println(number + " is not an Abundant Number ");
        }

    }
}