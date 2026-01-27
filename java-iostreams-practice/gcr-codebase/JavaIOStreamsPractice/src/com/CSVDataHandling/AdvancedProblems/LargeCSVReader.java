package com.CSVDataHandling.AdvancedProblems;

import java.io.*;

public class LargeCSVReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("bigfile.csv"));

        String line;
        int count = 0;
        int batch = 0;

        while ((line = br.readLine()) != null) {
            count++;
            batch++;

            if (batch == 100) {
                System.out.println("Processed: " + count + " records");
                batch = 0;
            }
        }

        br.close();
        System.out.println("Total Records: " + count);
    }
}
