package com.Day1.ValidAnagram;

public class ValidAnagramMain{
public static void main(String[] args) {
    Solution sol= new Solution();
    String s = "anagram";
    String t = "nagaram";

    boolean result = sol.isAnagram(s, t);

    System.out.println("Are the strings anagrams? " + result);
}
}