package com.CSVDataHandling.AdvancedProblems;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) {

        String filePath = "users.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                String email = d[2];
                String phone = d[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid Email → " + line);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid Phone → " + line);
                    valid = false;
                }

                if (valid) {
                    System.out.println("Valid → " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
