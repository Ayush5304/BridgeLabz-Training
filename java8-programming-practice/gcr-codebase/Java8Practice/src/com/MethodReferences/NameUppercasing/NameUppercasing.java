package com.MethodReferences.NameUppercasing;

import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> employees =
                List.of("ayush", "rohit", "aman", "neha");

        List<String> upper =
                employees.stream()
                         .map(String::toUpperCase)
                         .collect(Collectors.toList());

        System.out.println(upper);
    }
}
