package com.CSVDataHandling.AdvancedProblems;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {

        Map<Integer, String> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        br1.readLine();
        String line;

        while ((line = br1.readLine()) != null) {
            String[] d = line.split(",");
            map.put(Integer.parseInt(d[0]), d[1] + "," + d[2]);
        }

        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        br2.readLine();

        FileWriter fw = new FileWriter("merged.csv");
        fw.write("ID,Name,Age,Marks,Grade\n");

        while ((line = br2.readLine()) != null) {
            String[] d = line.split(",");
            int id = Integer.parseInt(d[0]);

            if (map.containsKey(id)) {
                fw.write(id + "," + map.get(id) + "," + d[1] + "," + d[2] + "\n");
            }
        }

        fw.close();
        System.out.println("CSV Merge Completed!");
    }
}

