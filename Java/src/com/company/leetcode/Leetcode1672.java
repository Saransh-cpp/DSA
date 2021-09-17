package com.company.leetcode;

public class Leetcode1672 {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
