import java.util.Scanner;
//a program to check whether a number is positive, negative, or zero
public class SignOfNumber{
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
  System.out.print("Enter number ");
  int number= sc.nextInt();
  if(number>0){
  System.out.println("number is"+ "positive");
  }
  else if (number<0){
  System.out.println("number is"+ "negative");
  }
  else {
  System.out.println("number is"+ "0");
  }
  sc.close();
  }
  }
  