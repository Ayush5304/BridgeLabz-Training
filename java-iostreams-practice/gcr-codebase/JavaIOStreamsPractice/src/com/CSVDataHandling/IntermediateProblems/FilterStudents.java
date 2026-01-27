package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudents {
    public static void main(String[] args) {

        String filePath = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            System.out.println("Students scoring more than 80:\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                double marks = Double.parseDouble(data[3]);

                if (marks > 80) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

