package com.company.leetcode;

public class Leetcode122 {
    public int maxProfit(int[] prices) {
        int maxSum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxSum += prices[i + 1] - prices[i];
            }
        }
        return maxSum;
    }
}
