package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class TransformNames {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList( "rohit", "ayush", "neha", "karan", "pooja", "amit");

        List<String> result =
                customers.stream()
                        .map(String::toUpperCase)  
                        .sorted()                  
                        .collect(Collectors.toList());

        System.out.println(" Customer Names (Uppercase + Sorted):\n");
        result.forEach(System.out::println);
    }
}
