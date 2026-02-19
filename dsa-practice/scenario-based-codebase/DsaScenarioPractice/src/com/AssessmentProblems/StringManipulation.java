package com.AssessmentProblems;

import java.util.Scanner;

public class StringManipulation {

	    static String process(String str, int k) {

	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        String changed = "";
	        for (int i = 0; i < reversed.length(); i++) {

	            char ch = reversed.charAt(i);
	            char lower = Character.toLowerCase(ch);

	            if (lower == 'a') ch = change(ch, 'e');
	            else if (lower == 'e') ch = change(ch, 'i');
	            else if (lower == 'i') ch = change(ch, 'o');
	            else if (lower == 'o') ch = change(ch, 'u');
	            else if (lower== 'u') ch = change(ch, 'a');

	            changed += ch;
	        }

	        String unique = "";
	        for (int i = 0; i < changed.length(); i++) {

	            char ch = changed.charAt(i);

	            if (unique.indexOf(ch) == -1) {
	                unique += ch;
	            }
	        }

	        int n = unique.length();

	        if (n > 0) {
	            k = k % n;
	            String part1 = unique.substring(n - k);
	            String part2 = unique.substring(0, n - k);
	            unique = part1 + part2;
	        }

	        return unique;
	    }

	    static char change(char original, char newChar) {

	        if (Character.isUpperCase(original))
	            return Character.toUpperCase(newChar);

	        return newChar;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int t = sc.nextInt();  

	        for (int i = 0; i < t; i++) {

	            String str = sc.next();
	            int k = sc.nextInt();

	            String result = process(str, k);
	            System.out.println(result);
	        }

	    }
	}
