

//a Java program to remove all duplicate characters from a given string and returnthe modified string

import java.util.Scanner;

// make a class RemoveDuplicate
public class RemoveDuplicate{
public static String duplicate(String input){
          String result="";
		  
	// take a for loop to store each character 
        for(int i=0; i<input.length(); i++){
        char ch= input.charAt(i);
	  if (result.indexOf(ch) == -1){
		  result+=ch;
	  }
		}
		return result;
}
public static void main (String [] args){
Scanner sc= new Scanner(System.in);

// take a user input
System.out.println("enter a string");
String input = sc.nextLine();
      
	  //make a method to call 
	  String RD = duplicate(input);
	   
	   // display the output
	  
	   System.out.println(" after removing duplicate"+ RD);
	   	  
}
}