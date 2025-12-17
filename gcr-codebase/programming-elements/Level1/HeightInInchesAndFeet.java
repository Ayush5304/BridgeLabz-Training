import java.util.*;
public class HeightInInchesAndFeet{
public static void main( String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("height in centimeters");
   double centimeters=sc.nextDouble();
   double InInches= centimeters/2.54;
   int feet =(int)InInches/12;
   System.out.println( "Your Height in cm is:" + centimeters + "while in feet is :"+ feet+ "and inches is:" +InInches);
   }
   }