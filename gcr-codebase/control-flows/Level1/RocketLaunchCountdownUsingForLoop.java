import java.util.Scanner;
// a program to count down the number for rocket launch
public class RocketLaunchCountdownUsingForLoop{
 public static void main(String[] args) {

 // Create Scanner object to take input from user
 Scanner sc=new Scanner(System.in);
  // take user input and intialize the counter
     System.out.print("enter a counter ");
     int counter= sc.nextInt();
	  if(counter<=0){
	 System.out.println("please right the correct counter value");
	 }
	 //take for loop in which decrement the counter till 1
	for(int i=counter; i>=1; i--){
	 System.out.println("updated counter value" + i);
	 }
	 sc.close();
	 }
	 }