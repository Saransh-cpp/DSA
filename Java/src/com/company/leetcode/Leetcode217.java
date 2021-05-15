package com.company.leetcode;

import java.util.HashMap;

public class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) return true;
            else map.put(num, 1);
        }
        return false;
    }
}
