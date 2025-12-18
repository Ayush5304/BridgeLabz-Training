import java.util.Scanner ;

//a program to find the power of a number
public class PowerOfANumberUsingWhile{

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
		 System.out.print("Enter power ");
        int power = sc.nextInt();

        // Check if number is valid
        if (number <= 0|| power<0 ) {
            System.out.println("enter valid positive number");
        } else {
		int result=1;
		int counter=0;
       while(counter<power){
	   result=result*number;
	   counter++;
	   }
	   System.out.println(number + " raised to " + power + "=" + result);
	   }
	   }
	   }
	   