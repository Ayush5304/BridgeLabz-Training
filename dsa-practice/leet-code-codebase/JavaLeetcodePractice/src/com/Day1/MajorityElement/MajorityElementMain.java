package com.Day1.MajorityElement;

import java.util.*;

public class MajorityElementMain{
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 1, 1, 2, 1};

        List<Integer> result = sol.majorityElement(nums);

        System.out.println("Majority elements (> n/3): " + result);
    }
}