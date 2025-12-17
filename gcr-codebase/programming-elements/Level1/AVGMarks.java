//Program to calculate average percentage of PCM marks
import java.util.*;
public class AVGMarks{
public static void main( String [] args){
  //  Marks in subjects
   int maths_marks=94;
   int physics_marks=95;
   int chemistry_marks=96;
  // Calculate average
   double AVG_Marks=((double) maths_marks+(double)  physics_marks +(double) chemistry_marks)/3;
  // output
  System.out.println("Sams AVG_Marks is : "+ AVG_Marks);
}
} 
