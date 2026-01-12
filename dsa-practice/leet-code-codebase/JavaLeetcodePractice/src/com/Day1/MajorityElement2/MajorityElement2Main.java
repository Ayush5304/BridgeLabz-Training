package com.Day1.MajorityElement2;
public class  MajorityElement2Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = sol.majorityElement(nums);

        System.out.println("Majority element (> n/2): " + result);
    }
}
