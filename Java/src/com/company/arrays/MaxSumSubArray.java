package com.company.arrays;


public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -4, -6, 1, 5};
        System.out.println("Maximum Sum is " + maxSumFunc(arr));
    }

    private static int maxSumFunc(int[] arr) {
        int curSum = 0;
        int maxSum = 0;
        for (int j : arr) {
            curSum += j;

            if (curSum > maxSum) {
                maxSum = curSum;
            }

            if (curSum < 0) {
                curSum = 0;
            }

        }

        if (maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > maxSum) {
                    maxSum = j;
                }
            }
        }
        return maxSum;
    }
}
