import java.util.Scanner;

// a program to count the number of digits in an integer.
public class CountDigits {

    public static void main(String[] args) {
	 // Create Scanner object
        Scanner sc = new Scanner(System.in);
 // Get integer input
        System.out.print("Enter a number ");
        int number = sc.nextInt();
		int count =0;
		  if (number == 0) {
            count = 1;
			}else {
		while(number!=0){
		number=number/10;
		count++;
		}
			}
		System.out.println("Number of digits " + count);
		}
		}
