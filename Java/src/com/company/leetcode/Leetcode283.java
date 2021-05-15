package com.company.leetcode;

import java.util.Arrays;

public class Leetcode283 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1, 0, 0, 2, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;

                lastNonZeroFoundAt++;
            }
        }
//         int lastNonZeroFoundAt = 0;
//         for (int i = 0; i < nums.length; i++) {
//         if (nums[i] != 0) {
//             nums[lastNonZeroFoundAt++] = nums[i];
//         }
//     }


//         for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
//         nums[i] = 0;
//     }
    }
}
