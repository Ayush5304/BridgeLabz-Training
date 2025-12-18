// Program to calculate volume of Earth
import java.util.*;
public class VolumeOfEarth{
public static void main( String [] args){
	// Radius of Earth in kilometers
   double radiusKM=6378;
   double pi=Math.PI;  // Value of Pi
   double volumeInKM=(4/3)*pi*Math.pow(radiusKM,3); // Volume formula of sphere
   double radiusMiles = radiusKM* 0.621371;
   double volumeMiles = (4/3) * pi * Math.pow(radiusMiles, 3); // Convert cubic km to cubic miles
      // Output
   System.out.println( "The volume of earth in cubic kilometers is " + volumeInKM +" and cubic miles is " + volumeMiles);
        }
		}
