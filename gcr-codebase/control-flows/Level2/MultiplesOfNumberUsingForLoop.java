import java.util.Scanner;

// a program to find all the multiples of a number taken as user input below 100
public class MultiplesOfNumberUsingForLoop {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is valid
        if (number <= 1 || number>100 ) {
            System.out.println("No multiples  exists for the given number.");
        } else {
       System.out.println("Multiples of " + number + " are");

            // Loop from 1 to less than 100
            for (int i = 100; i >=1; i--) 
			if(i%number==0){
			System.out.println("multiples of a number "+ number + " are " );
			System.out.println(i);
			}
			}
			}
}
			
      