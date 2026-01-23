package com.Day1.ResumeAnalyzer;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    private static final String[] KEYWORDS = {"java", "python", "spring"};

    public static void main(String[] args) {

        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> sortedList = new ArrayList<>();

        File folder = new File("resumes");

        for (File file : folder.listFiles()) {
            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new IllegalArgumentException("Invalid file format: " + file.getName());
                }

                String content = readFile(file);

                String email = extractEmail(content);
                String phone = extractPhone(content);
                int keywordCount = countKeywords(content);

                ResumeData data = new ResumeData(email, phone, keywordCount);
                resumeMap.put(email, data);
                sortedList.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName() + " → " + e.getMessage());
            }
        }

        sortedList.sort((a, b) -> b.getKeywordCount() - a.getKeywordCount());

        System.out.println("\n Sorted Candidate List:");
        sortedList.forEach(System.out::println);
    }

    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    private static String extractEmail(String text) {
        Pattern p = Pattern.compile("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+");
        Matcher m = p.matcher(text);
        if (m.find()) return m.group();
        throw new IllegalArgumentException("Email not found");
    }

    private static String extractPhone(String text) {
        Pattern p = Pattern.compile("\\b[6-9][0-9]{9}\\b");
        Matcher m = p.matcher(text);
        if (m.find()) return m.group();
        throw new IllegalArgumentException("Phone not found");
    }

    private static int countKeywords(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (String keyword : KEYWORDS) {
            Pattern p = Pattern.compile("\\b" + keyword + "\\b");
            Matcher m = p.matcher(text);
            while (m.find()) count++;
        }
        return count;
    }
}
