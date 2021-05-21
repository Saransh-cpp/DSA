package com.company.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode128 {

    public static void main(String[] args) {
        System.out.println(longestConsecutiveEff(new int[]{1, 0, 1, 2}));
    }

    public static int longestConsecutiveEff(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;
        int currLen = 0;
        for (int num: set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                while (set.contains(currNum + 1)) {
                    currLen++;
                    currNum++;
                }

                maxLen = Math.max(currLen, maxLen);
            }
            currLen = 0;
        }
        return maxLen != 0 ? maxLen + 1 : 1;
    }

//    My method, obviously inefficient
    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int element = nums[0];

        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];

        nums[j++] = nums[n-1];

        int count = 0;
        int maxCount = 0;
        int start = 0;
        for (int i = 0; i < j - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                count++;
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                }
            } else {
                count = 0;
            }


        }
        return (maxCount != 0 ? maxCount : 1);
    }
}
