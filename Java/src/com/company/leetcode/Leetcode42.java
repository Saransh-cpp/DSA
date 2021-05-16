package com.company.leetcode;

public class Leetcode42 {
    public int trap(int[] height) {

        if (height.length == 0) {
            return 0;
        }

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = 0;
        right[height.length - 1] = 0;
        int max;

        max = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }

        max = height[height.length - 1];
        for (int i = height.length - 2; i > -1; i--) {
            if (height [i] > max) {
                max = height[i];
            }
            right[i] = max;
        }

        max = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(left[i], right[i]);
            if ((min - height[i]) > 0) {
                max += min - height[i];
            }
        }
        return max;
    }
}
