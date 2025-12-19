import java.util.Scanner;

 //a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number
public class UntiluserEnterZero{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
		 // Define an integer array of size 10
		double arr[] =new double[10];
			System.out.println("enter the number");
		    int number= sc.nextInt();	
		double total= 0.0;
		int i=0;
		while(i<10){
		arr[i] =sc.nextDouble();
		System.out.println("again enter any number");
		if(arr[i]<0 || arr[i] ==0){
		break;
		
		}
		i++;
		}
		
		for(int j=0; j<arr.length; j++){
		total+=arr[j];
		}
			System.out.println(" enter total value " + total);
			}
			}