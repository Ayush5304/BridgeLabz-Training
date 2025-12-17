// Program to divide pens among students
import java.util.*;
public class PenDistribution{
public static void main( String [] args){
       // Total pens and students
      int totalPens=14;
      int totalStudents=3;
      // Pens per student using division
      int penPerStudents=totalPens/totalStudents;
      // Remaining pens using modulus operator
      int remainingPens=totalPens%totalStudents;
      System.out.println("The Pen Per Student is : " + penPerStudents +" and the remaining pen not distributed is: " +remainingPens);
   }
   }
