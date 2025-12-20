import java.util.Scanner;

public class NumberAnalysis{

    // Method to check whether number is positive or negative
    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        }
        return false;
    }
	
    // Method to check whether number is even or odd
    public static boolean isEven(int number) {
        if (number%2==0) {
            return true;
        }
        return false;
    }
	
	 // Method to compare first and last elements of array
    public static int compare(int number1, int number2) {
        if (number1>number2) {
            return 1;
        }
         else if (number1==number2) {
            return 0;
    }else{
	return -1;
	}
	}
	public static void main (String [] args){
	Scanner sc= new Scanner(System.in);
	int numbers[] =new int [5];
	for(int i=0;i<numbers.length; i++){
	System.out.println("enter the numbers" + (i+1));
	numbers[i]=sc.nextInt();
	}
	  System.out.println("Number Analysis");
	  
	  for(int i=0; i<numbers.length; i++){
	  if(isPositive(numbers[i])){
	  System.out.println(numbers[i]+ "is positive");
	  if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(numbers[i] + "is Negative");
            }
        }
	// Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("Comparison Result");

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}

	
	