// a program to toggle the case of each character in a given string. Convert uppercase letters to lowercase and vice versa
import java.util.Scanner;

public class ToggleCharacters{

    // Method to toggle the each character in a given string
    public static String togglingCharacters(String mainStr) {
    String result="";
     for(int i=0; i<mainStr.length(); i++){
     char ch= mainStr.charAt(i);
	 if(Character.isUpperCase(ch)){
	 result+=Character.toLowerCase(ch);
	 }
	 else if(Character.isLowerCase(ch)){
	result+=Character.toUpperCase(ch);
   }
   }
   return result;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take main string and substring input
        System.out.print("Enter the main string");
        String mainStr = sc.nextLine();
	
        // Call method
        String TS = togglingCharacters(mainStr);
        System.out.println("After toggling " + mainStr + TS);
    }
}
