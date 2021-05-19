package com.company.leetcode;

public class Leetcode31 {
    public void nextPermutation(int[] nums) {

        if (nums.length == 1) return;

        int i = nums.length - 2;
        while ( i >= 0 && nums[i] >= nums[i + 1]) i--;

        int j = nums.length - 1;
        if (i >= 0) {
            while (j >= 0 && nums[i] >= nums[j] ) j--;

            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }


        for (int k = i + 1, l = nums.length - 1; k < l; k++, l--) {
            int temp1 = nums[k];
            nums[k] = nums[l];
            nums[l] = temp1;
        }
    }
}
