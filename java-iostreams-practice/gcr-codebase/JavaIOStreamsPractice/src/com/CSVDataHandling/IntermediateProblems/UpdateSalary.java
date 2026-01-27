package com.CSVDataHandling.IntermediateProblems;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile)
        ) {

            String line;
            fw.write(br.readLine() + "\n"); 

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String dept = data[2];
                double salary = Double.parseDouble(data[3]);

                if (dept.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }

                fw.write(data[0] + "," + data[1] + "," + dept + "," + salary + "\n");
            }

            System.out.println("Updated CSV created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
