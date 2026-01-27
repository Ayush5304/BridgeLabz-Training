package com.CSVDataHandling.BasicProblems;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (FileWriter fw = new FileWriter(filePath)) {

            fw.write("ID,Name,Department,Salary\n");

            fw.write("1,Ayush,IT,50000\n");
            fw.write("2,Rohit,HR,45000\n");
            fw.write("3,Aman,Finance,60000\n");
            fw.write("4,Neha,Marketing,48000\n");
            fw.write("5,Pooja,Operations,52000\n");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
