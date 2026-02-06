package com.AssessmentProblems.OceanFleet;
import java.util.*;
import java.util.List;
public class VesselUtil extends Vessel {
	
 private List<Vessel>vesselList= new ArrayList<>();
   
       public List<Vessel>getVesselList(){
    	   return vesselList;
       }
       public void setVesselList(List<Vessel> vesselList) {
           this.vesselList = vesselList;
       }
       
       public void addVesselPerformance(Vessel vessel) { 
    	   if(!vesselList.contains(vessel)) {
    		   vesselList.add(vessel);
    	   }
       }
       public Vessel getVesselById(String vesselId) {

           for (Vessel v : vesselList) {
               if (v.getVesselId().equals(vesselId)) { 
                   return v;
               }
           }
           return null;
       }

   public List<Vessel> getHighPerformanceVessels(){
	   List<Vessel>finalList= new ArrayList<>();
   
	  double maxSpeed= Double.MIN_VALUE;
	  
	  for(Vessel v: vesselList) {
		 if(v.getAverageSpeed()>maxSpeed) {
			 maxSpeed=v.getAverageSpeed();
		 }
	  }
	  for(Vessel v: vesselList) {
		  if (v.getAverageSpeed() == maxSpeed) {
		  finalList.add(v);
	  }
	  }  
	  return finalList;
   }

} 

