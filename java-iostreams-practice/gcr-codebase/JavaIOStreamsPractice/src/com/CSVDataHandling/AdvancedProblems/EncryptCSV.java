package com.CSVDataHandling.AdvancedProblems;
import java.io.*;

public class EncryptCSV {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("secure_employees.csv");
        fw.write("ID,Name,Email,Salary\n");

        fw.write("1,Ayush," + CryptoUtil.encrypt("ayush@gmail.com") + "," +
                 CryptoUtil.encrypt("50000") + "\n");

        fw.write("2,Rohit," + CryptoUtil.encrypt("rohit@gmail.com") + "," +
                 CryptoUtil.encrypt("60000") + "\n");

        fw.close();

        System.out.println("Encrypted CSV Created!");
    }
}
