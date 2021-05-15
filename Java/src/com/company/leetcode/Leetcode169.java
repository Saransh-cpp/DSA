package com.company.leetcode;

public class Leetcode169 {
    public int majorityElement(int[] nums) {
        int count = 1;
        int currentElement = nums[0];
        for (int num : nums) {
            if (num == currentElement) count++;
            else count--;

            if (count == 0) {
                currentElement = num;
                count = 1;
            }
        }
        return currentElement;
    }
}
