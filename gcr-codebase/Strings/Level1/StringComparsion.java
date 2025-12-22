import java.util.Scanner;

public class StringComparsion{

     	 public static boolean compareStrings(String s1, String s2) {
		 boolean isEqual= false;
		 if(s1.equals(s2)){
		 isEqual= true;
		 }
		 return isEqual;
		 }
		  public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1= sc.next();
		System.out.println("enter the second string");
		String s2= sc.next();
		
		boolean CS= compareStrings(s1, s2);
		if(CS==true){
		System.out.println("strings are equal");
		}
		else{
		System.out.println("strings are not  equal");
		}

}
}