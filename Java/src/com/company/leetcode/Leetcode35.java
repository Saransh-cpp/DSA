package com.company.leetcode;

public class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        if (target < nums[low]) {
            return 0;
        } else if (target > nums[high]) {
            return high + 1;
        }
        mid = (low + high) / 2;
        while (low <= high) {
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
            mid = (low + high) / 2;
        }
        if (nums.length == 1) return 0;
        if (mid == 0) return 1;
        if (nums[mid] < target) return mid + 1;
        else return mid;
    }
}
