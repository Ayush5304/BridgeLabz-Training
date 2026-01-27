package com.CSVDataHandling.AdvancedProblems;

import java.io.*;

public class DecryptCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("secure_employees.csv"));
        br.readLine();

        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            String email = CryptoUtil.decrypt(d[2]);
            String salary = CryptoUtil.decrypt(d[3]);

            System.out.println(d[0] + " " + d[1] + " " + email + " " + salary);
        }

        br.close();
    }
}
