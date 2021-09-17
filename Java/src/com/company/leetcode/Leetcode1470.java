package com.company.leetcode;

public class Leetcode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length / 2; i++) {

            ans[2*i] = nums[i];
        }
        int j = 0;
        for (int i = nums.length / 2; i < nums.length - 1; i++) {

            ans[2*j + 1] = nums[i];
            j++;
        }
        ans[ans.length - 1] = nums[nums.length - 1];
        return ans;
    }
}
