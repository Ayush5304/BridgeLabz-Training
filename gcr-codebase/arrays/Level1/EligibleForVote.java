import java.util.Scanner;

//a program to take user input for the age of all 10 students in a class
//and check whether the student can vote depending on his/her age is greater or equal to 18.

public class EligibleForVote{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		int arr[] =new int[10];
		System.out.println("enter the student's age");
		for(int i=0; i<arr.length; i++){
			
		arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
		if(arr[i]>=18){
		
		System.out.println("The student with the age" + arr[i] +" can vote");
		}
		else{
		System.out.println(" The student with the age" +arr[i] + "cannot vote");

		}
		}
		}
}