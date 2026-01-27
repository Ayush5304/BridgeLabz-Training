package com.Day1.MarkMate;

import com.google.gson.*;

import java.io.FileWriter;
import java.util.*;

public class MarkMateApp {

    public static void main(String[] args) {

        String csvFile = "students.csv";

        try {
            List<String[]> rows = CSVReaderUtil.readCSV(csvFile);
            String[] header = rows.get(0);

            JsonArray jsonArray = new JsonArray();

            for (int i = 1; i < rows.size(); i++) {
                Student student = MarkProcessor.process(header, rows.get(i));

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                JsonElement json = gson.toJsonTree(student);
                jsonArray.add(json);
            }

            FileWriter fw = new FileWriter("report_card.json");
            fw.write(new GsonBuilder().setPrettyPrinting().create().toJson(jsonArray));
            fw.close();

            System.out.println("🎓 MarkMate Report Generated Successfully!");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

