package com.MethodReferences.InvoiceObjectCreation;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceGenerator {
    public static void main(String[] args) {

        List<Integer> transactions =
                List.of(5001, 5002, 5003, 5004);

        List<Invoice> invoices =
                transactions.stream()
                            .map(Invoice::new)  
                            .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
