package com.company.leetcode;

import java.util.HashMap;

public class Leetcode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("V"));
    }
    public static int romanToInt(String s) {
        int finalValue = 0;
        HashMap<String, Integer> map = new HashMap<>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
        map.get(s);

        System.out.println(map);
        for (int i = s.length() - 1; i > -1; i--) {
            if (map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) finalValue -= map.get(s.charAt(i));
            else finalValue += map.get(s.charAt(i));
        }
        return finalValue;
//        return 5;
    }
}
