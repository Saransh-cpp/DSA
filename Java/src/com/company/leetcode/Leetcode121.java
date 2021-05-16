package com.company.leetcode;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int maxSum = 0;
        int lowElement = prices[0];
        for (int price : prices) {
            if (price < lowElement) {
                lowElement = price;
            }
            int currSum = price - lowElement;

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
