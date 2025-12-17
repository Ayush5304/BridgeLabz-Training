import java.util.*;
public class VolumeOfEarth{
public static void main( String [] args){
   double radiusKM=6378;
   double pi=Math.PI;
   double volumeInKM=(4/3)*pi*Math.pow(radiusKM,3);
   double radiusMiles = radiusKM* 0.621371;
        double volumeMiles = (4/3) * pi * Math.pow(radiusMiles, 3);

        System.out.println( "The volume of earth in cubic kilometers is " + volumeInKM +" and cubic miles is " + volumeMiles);
        }
		}
