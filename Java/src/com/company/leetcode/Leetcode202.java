package com.company.leetcode;

import java.util.HashMap;

public class Leetcode202 {
    public static Boolean isHappy (int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        while (n != 1) {
            while (n > 0) {
                int rem = n % 10;
                sum += Math.pow(rem, 2);
                n /= 10;
            }
            if (map.containsKey(sum)) return false;
            else map.put(sum, 1);
            n = sum;
            sum = 0;
        }
        return true;
    }
}
