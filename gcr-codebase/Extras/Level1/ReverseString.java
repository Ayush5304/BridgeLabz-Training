

//a Java program to check if a given string is a palindrome (a string that reads thesame forward and backward)

import java.util.Scanner;

// make a class checkpalindrome
public class CheckPalindrome{
public static String palindromeOrNot(String input){
          String result="";
		  
	// take a for loop to store each character 
        for(int i=input.length()-1; i>=0; i--){
        result+= input.charAt(i);
		}
       if (result == input){
		   return true;
	   }
}
	   else{
		   return false;
	   }
 


public static void main (String [] args){
Scanner sc= new Scanner(System.in);

// take a user input
System.out.println("enter a string");
String input = sc.nextLine();
      
	  //make a method to call 
	  String CP =palindromeOrNot( input);
	   
	   // display the output
	   if(true){
	   System.out.println("string is a palindrome");
	   }
	   else{
		    System.out.println("string is not a palindrome");
		}
		}