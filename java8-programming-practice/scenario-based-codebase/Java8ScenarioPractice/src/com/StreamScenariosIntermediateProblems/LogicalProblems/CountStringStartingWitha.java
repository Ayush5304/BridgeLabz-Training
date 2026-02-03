package com.StreamScenariosIntermediateProblems.LogicalProblems;

import java.util.List;
import java.util.Scanner;

public class CountStringStartingWitha {
    public static void main(String[] args) {
    	   List<String>list=List.of("apple","banana","ant","car");
	 long countWords= list.stream().filter(e->e.startsWith("a")).count();
	 System.out.println(countWords);
    }

}