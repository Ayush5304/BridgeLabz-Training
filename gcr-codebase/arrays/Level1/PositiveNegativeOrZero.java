import java.util.Scanner;

//a a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero
public class PositiveNegativeOrZero{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		 // Define an integer array of size 5
		int arr[] =new int[5];
		System.out.println("enter the number");
		for(int i=0; i<arr.length; i++){
			
		arr[i]=sc.nextInt();
		}
		   // Loop through the array to check each number
		for(int i=0; i<arr.length; i++){
		if(arr[i]>0){
			 if(arr[i]%2==0){
		  System.out.println("even");
			 }
		  else{
			  System.out.println("odd");
		  }
		}else if(arr[i]<0){
			  System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}
		}
		 // Compare first and last elements of the array
		if(arr[0]==arr[4]){
			 System.out.println(" on comparing first and last element of the array"+ "equal");
		}
	 else if (arr[0]>arr[4]){
			 System.out.println(" on comparing first and last element of the array"+ " arr[0]>arr[4] greater");
		}
		else {
			 System.out.println(" on comparing first and last element of the array"+ " arr[0]<arr[4] less");
		}
			
}
	}
