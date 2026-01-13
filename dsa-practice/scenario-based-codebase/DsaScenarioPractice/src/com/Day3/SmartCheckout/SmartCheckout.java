package com.Day3.SmartCheckout;

import java.util.*;
public class SmartCheckout {
   Queue<Customer>queue= new LinkedList<>();
   HashMap<String, Integer>priceMap= new HashMap<>();
   HashMap<String, Integer>stockMap= new HashMap<>();
	
	public void addItem(String item, int price, int stock) {
		priceMap.put(item, price);
		stockMap.put(item, stock);
	}
	public void addCustomer(Customer customer) {
		queue.add(customer);
		System.out.println(customer.name+ "joined the checkout queue");
	}
   public void processCustomer() {
	   if(queue.isEmpty()) {
		   System.out.println("No customers in queue");
		   return ;
	   }
	   Customer customer= queue.poll();
	   int total=0;
	   System.out.println("Billing for"+ customer.name);
	   for (String item : customer.items) {
           if (stockMap.containsKey(item) && stockMap.get(item) > 0) {
               total += priceMap.get(item);
               stockMap.put(item, stockMap.get(item) - 1);
               System.out.println(item + " purchased");
           } else {
               System.out.println(item + " out of stock");
           }
       }

       System.out.println("Total Bill:" + total);
   }
}
	   

