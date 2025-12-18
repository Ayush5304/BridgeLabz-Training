import java.util.Scanner ;

//a program to find the power of a number
public class PowerOfANumber{

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
		 System.out.print("Enter power ");
        int power = sc.nextInt();

        // Check if number is valid
        if (number <= 1 || power<0 ) {
            System.out.println("enter valid positive number");
        } else {
		int result=1;
       // run a for loop 
	   for(int i=1; i<=power; i++){
	   result*=number;
	  System.out.println(number + " raised to the power " + power + " is " + result);
	   
}
}
}
}         
			
      