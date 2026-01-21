package com.Day9.TailorShop;

public class TailorShop {
public static void  DeliveryDeadline(Order [] arr) {
	for(int i=0; i<arr.length; i++) {
		 Order curr= arr[i];
		int prev= i-1;
		while(prev>=0 && arr[prev].deliveryDate>curr.deliveryDate) {
			arr[prev+1]=arr[prev];
			prev--;
		}
		arr[prev+1]=curr;
	}
}
	public static void main(String[] args) {
		Order[] arr= {new Order( 101, "Ayush", 2),
				new Order(102, "harshal", 5),
				new Order (103, "devarshi", 7)};
		DeliveryDeadline(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr[i]+ " ");
		}
	}
}
