import java.util.Scanner;

// a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
public class MultiplicationnOfNumbersFromSixToNine{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		 // Define an integer array of size 11
		int arr[] =new int[4];
		System.out.println("enter the number");
		 int number= sc.nextInt();
		 for(int i=6; i<9; i++){
		 arr[i-6]=number*i;
		 System.out.println( number+ "*" + i + "=" + arr[i-6]);
}
}
}	