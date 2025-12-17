import java.util.*;
public class PenDistribution{
public static void main( String [] args){
   int totalPens=14;
   int totalStudents=3;
   int penPerStudents=totalPens/totalStudents;
   int remainingPens=totalPens%totalStudents;
   System.out.println("The Pen Per Student is : " + penPerStudents +" and the remaining pen not distributed is: " +remainingPens);
   }
   }