

//a Java program to reverse a given string without using any built-in reverse functions
import java.util.Scanner;

// make a class ReverseString
public class ReverseString{
public static String toReverseString(String input){
          String result="";
		  
	// take a for loop to store each character 
        for(int i=input.length()-1; i>=0; i--){
        result+= input.charAt(i);
		}
        return result;
 
}

public static void main (String [] args){
Scanner sc= new Scanner(System.in);

// take a user input
System.out.println("enter a string");
String input = sc.nextLine();
      
	  //make a method to call 
	  String RS=toReverseString( input);
	   
	   // display the output
	   System.out.println("reverse of a string " + RS);

		}
		}