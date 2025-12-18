import java.util.Scanner;
// a program to count down the number for rocket launch
public class RocketLaunchCountdown{
 public static void main(String[] args) {

 // Create Scanner object to take input from user
 Scanner sc=new Scanner(System.in);
  // take user input 
     System.out.print("enter a counter ");
     int counter= sc.nextInt();
	 if(counter<=0){
	 System.out.println("please right the correct counter value");
	 }
	 while(counter!=1){
	 counter--;
	 System.out.println("updated counter value" + counter);
	 }
	 sc.close();
	 }
	 }