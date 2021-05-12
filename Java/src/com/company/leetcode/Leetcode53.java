package com.company.leetcode;

public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currSum = 0;
        for (int j : nums) {
            currSum += j;

            if (maxSum < currSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        if (maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num > maxSum) {
                    maxSum = num;
                }
            }
        }

        return maxSum;
    }
}
