package com.company.leetcode;

public class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        int lengthOfArray = nums.length;
        int i = 0;
        while (i < lengthOfArray - 1) {
            if (nums[i] == nums[i + 1]) {
                lengthOfArray--;
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }

            }
            if (nums[i] != nums[i + 1]) {
                i++;
            }
        }
        return lengthOfArray;
    }

    public int optimized(int[] nums) {
        int start = 1, dup = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dup++;
            } else {
                nums[start] = nums[i];
                start++;
            }
        }
        return nums.length - dup;
    }
}
