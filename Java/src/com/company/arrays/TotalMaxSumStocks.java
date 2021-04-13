package com.company.arrays;

public class TotalMaxSumStocks {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,6,7};
        System.out.println("Total possible profit - " + maxProfit(arr));
    }

    private static int maxProfit(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                sum += (arr[i + 1] - arr[i]);
            }
        }
        return sum;
    }
}
