import java.util.Scanner;

// a program to print a multiplication table of a number
public class MultiplicationTable{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		 // Define an integer array of size 11
		int arr[] =new int[11];
		System.out.println("enter the number");
		 int number= sc.nextInt();
		 for(int i=1; i<arr.length; i++){
		 arr[i]=number*i;
		 System.out.println( number+ "*" + i + "=" + arr[i]);
}
}
}		 