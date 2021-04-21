package com.company.DSASheet;

import java.util.HashMap;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 1};
        System.out.println(findDuplicateHashMap(a));
    }

    // can be used if the element repeats only once
    public int findDuplicateXOR(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        for (int i = 1; i <= nums.length - 1; i++) {
            res ^= i;
        }
        return res;
    }

    public static int findDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res = nums[i];
                break;
            } else {
                map.put(nums[i], 1);
            }
        }
        return res;
    }
}
