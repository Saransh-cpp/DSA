package com.company.leetcode;

public class Leetcode123 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }

//    Uses DP, not done yet
    public static int maxProfit(int[] prices) {
        int currSum = 0;
        int maxSum = 0;
        int secondMaxSum = 0;
        int minElement = prices[0];
        for (int i = 0; i < prices.length - 1; i++) {
            currSum = prices[i] - minElement;

            if (currSum >= maxSum) {
                secondMaxSum = maxSum;
                maxSum = currSum;
            } else if (currSum > secondMaxSum) {
                secondMaxSum = currSum;
            }

            if (prices[i] < minElement) {
                minElement = prices[i];
            }

        }
//            if (prices[i] <= prices[i + 1]) {
//                currSum += prices[i + 1] - prices[i];
//            } else {
//                if (currSum >= maxSum) {
//                    secondMaxSum = maxSum;
//                    maxSum = currSum;
//                    // currSum = 0;
//                } else if (currSum > secondMaxSum) {
//                    secondMaxSum = currSum;
//                    // currSum = 0;
//                }
//                currSum = 0;
//            }
//        }
//
//        if (currSum >= maxSum) {
//            secondMaxSum = maxSum;
//            maxSum = currSum;
//            currSum = 0;
//        } else if (currSum > secondMaxSum) {
//            secondMaxSum = currSum;
//            currSum = 0;
//        }
        return maxSum + secondMaxSum;
    }
}
