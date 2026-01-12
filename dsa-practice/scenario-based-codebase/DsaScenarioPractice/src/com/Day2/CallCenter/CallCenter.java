package com.Day2.CallCenter;

import java.util.*;

class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> a.customerId.compareTo(b.customerId));

    HashMap<String, Integer> callCountMap = new HashMap<>();

    void receiveCall(Customer customer) {

        if (customer.isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        callCountMap.put(customer.customerId,
                callCountMap.getOrDefault(customer.customerId, 0) + 1);
    }

    void serveCall() {
        if (!vipQueue.isEmpty()) {
            Customer c = vipQueue.poll();
            System.out.println("Serving VIP customer: " + c.customerId);
        } else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Serving normal customer: " + c.customerId);
        } else {
            System.out.println("No calls in queue");
        }
    }

    void displayCallCounts() {
        System.out.println("Monthly Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

  
  
  

