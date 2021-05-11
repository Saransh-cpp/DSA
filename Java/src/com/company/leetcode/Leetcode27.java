package com.company.leetcode;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            if (nums[low] == val && nums[high] == val) {
                high--;
            } else if (nums[high] == val) {
                high--;
            } else if (nums[low] == val){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
                low++;
            } else {
                low++;
            }
        }
        return high + 1;
    }
}
