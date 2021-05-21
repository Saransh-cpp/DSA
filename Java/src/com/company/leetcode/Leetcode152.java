package com.company.leetcode;

public class Leetcode152 {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for(int i = 1; i < nums.length; i++){
            int prevMax = currMax;

            currMax = Math.max(nums[i], Math.max(nums[i]*currMax, nums[i]*currMin));
            currMin = Math.min(nums[i], Math.min(nums[i]*prevMax, nums[i]*currMin));
            max = Math.max(max, currMax);
        }
        return max;
    }

}
