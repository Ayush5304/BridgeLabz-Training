package com.Day9.MedWarehouse;
import java.util.*;
public class MedWarehouse {
  public static void medicineRecords(Medicine[] arr, int low, int high) {
	  if(low<high) {
		  int mid= (low+high)/2;
		  medicineRecords(arr, low, mid);
		  medicineRecords(arr, mid+1, high);
		  medicineRecordsMerge(arr, low, mid, high);
	  }
  }
  public static void medicineRecordsMerge(Medicine[] arr, int low, int mid, int high) {
	  int n1=mid-low+1;
	  int n2= high-mid;
	  int []L= new int [n1];
	  int []R= new int [n2];
	  
	  for(int i=0; i<n1; i++) 
		  L[i]= arr[low+i].expiryDate;
		  
		  for(int j=0; j<n2; j++) 
			  R[j]= arr[mid+1+j].expiryDate;
			  
		  int i=0, j=0, k=low;
		  while(i<n1 && j<n2) {
			  if(L[i]<=R[j]) {
				  arr[k].expiryDate=L[i++];
			  }
			  else {
				  arr[k].expiryDate=R[j++];
			  }
			  k++;
		  }
		  
		  while(i<n1) {
			  arr[k++].expiryDate=L[i++];
		  }
		  while(i<n2) {
			  arr[k++].expiryDate=R[j++];
		  }		 		  
		  }
	  
  
		  public static void main(String[] args) {
			  Medicine[] arr= { new Medicine("paracetamol", 5),
					  new Medicine("syrup", 9)};
			  medicineRecords(arr, 0, arr.length-1);
			
			  for(int i=0; i<arr.length; i++) {
				  System.out.println(arr[i]+ " " );
			  }
  }
}
