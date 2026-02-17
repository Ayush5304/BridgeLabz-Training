package com.AssessmentProblems;

import java.util.*;

public class EchoWeaveEncryption {

	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter a String");
  String input = sc.nextLine();
  
    String regex= "^[A-Za-z]+$";
    if(!input.matches(regex)) {
    	System.out.println("<input> is an invalid input");
    }
 String str1= input.toUpperCase();
 LinkedHashMap<Character, Integer>freq= new LinkedHashMap<>();
 
  for(int i=0; i<str1.length(); i++) {
	  
	  freq.put(str1.charAt(i), freq.getOrDefault(str1.charAt(i), 0)+1);
  }   
	  StringBuilder evenStr= new StringBuilder();
	  StringBuilder oddStr= new StringBuilder();
	  
	  int singleCount=0;
	  for(Map.Entry<Character, Integer> e: freq.entrySet()) {
		  int value = e.getValue();
		  char  key= e.getKey();
		  
		  if (e.getValue() == 1) {
              singleCount++;
		  }         
	  if(value%2==0) {
		  evenStr.append(key);
	  }else {
		  oddStr.append(key);
	  }
  
	  }
	 String output= evenStr.append(oddStr).toString();
	
	  
	  for(Map.Entry<Character, Integer> e: freq.entrySet()) {
		  int count = e.getValue();
		  for(int i=1; i<count; i++) {
		  output+=e.getKey();
		  }
	  }
	  int len = output.length();	  
      int midIndex = 0 ; 
      if(len%2==0) {
    	  midIndex = len/2 ; 
      }else {
    	  midIndex = (len/2)+1 ; 
      }
      
if(singleCount!=0) {
      output = output.substring(0, midIndex) + singleCount +output.substring(midIndex);
}
else {
	output = output.substring(0, midIndex) +output.substring(midIndex);
}
		  System.out.println(output);
	  }		    	
	}
	

	


