package com.company.arrays;

import java.util.Arrays;

public class RainWaterTrap {
    public static void main(String[] args) {
            int[] arr = new int[]{3,1,2,4,0,1,3,2};
            System.out.println("Total possible water - " + waterCount(arr));
    }

    private static int waterCount(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int leftMax = arr[0];
        int rightMax = arr[arr.length - 1];
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = Math.max(leftMax, arr[i]);
            leftMax = element;
            left[i] = element;
        }

        for (int i = arr.length - 1; i > -1; i--) {
            int element = Math.max(rightMax, arr[i]);
            rightMax = element;
            right[i] = element;
        }

        System.out.println(Arrays.toString(left) + Arrays.toString(right));
        for (int i = 0; i < arr.length; i++) {
            totalWater += (Math.min(left[i], right[i]) - arr[i]);
        }
        return totalWater;
    }
}
