package com.Day1.MarkMate;


import java.util.*;

public class MarkProcessor {

    public static Student process(String[] header, String[] row) {

        int roll = Integer.parseInt(row[0]);
        String name = row[1];

        Map<String, Integer> marks = new LinkedHashMap<>();

        for (int i = 2; i < header.length; i++) {
            int score = Integer.parseInt(row[i]);

            if (score < 0 || score > 100)
                throw new IllegalArgumentException("Invalid marks: " + score);

            marks.put(header[i], score);
        }

        return new Student(roll, name, marks);
    }
}

