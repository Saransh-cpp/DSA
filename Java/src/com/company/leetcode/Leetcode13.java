package com.company.leetcode;

import java.util.HashMap;

public class Leetcode13 {
    public int romanToInt(String s) {
        int finalValue = 0;
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int prev = 0;
        int num = 0;
        int end = s.length() - 1;
        while (end >= 0) {
            int cur = map.get(s.charAt(end));
            if (prev > cur) {
                num -= cur;
            } else {
                num += cur;
            }
            prev = cur;
            end--;
        }
        return num;
    }
}
