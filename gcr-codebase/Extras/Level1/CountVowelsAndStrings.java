

//a program to count the number of vowels and consonants in a given string
import java.util.Scanner;

// make a class CountVowelsAndStrings
public class CountVowelsAndStrings{
public static void main (String [] args){
Scanner sc= new Scanner(System.in);

// take a user input
System.out.println("enter a string");
String str= sc.nextLine();

//convert every character to lowercase
 str= str.toLowerCase();
 int consonants=0;
 int vowels=0;
 
 // take a for loop to store each character 
 for(int i=0; i<str.length(); i++){
    char ch= str.charAt(i);
	
	if(ch>='a' && ch<='z'){
	   if(ch=='a' || ch=='e' || ch=='i' || ch== 'o' || ch=='u'){
	   vowels++;
	   }
	   else{
	   consonants++;
	   }
	   }
	   }
	   // display the output
	   System.out.println("number of vowels" + vowels);
	    System.out.println("number of consonants" + consonants);
		}
		}