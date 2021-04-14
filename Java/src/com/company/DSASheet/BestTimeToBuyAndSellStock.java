package com.company.DSASheet;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,6,2,10};
        System.out.println("Total possible profit - " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int min = arr[0];
        int maxSum = 0;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            int curSum = j - min;

            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
