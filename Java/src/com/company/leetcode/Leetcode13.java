package com.company.leetcode;

import java.util.HashMap;

public class Leetcode13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));
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
            if (s.length() == 1) return map.get(Character.toString(s.charAt(0)));
            if (map.get(Character.toString(s.charAt(i + 1))) > map.get(Character.toString(s.charAt(i)))) finalValue -= map.get(Character.toString(s.charAt(i)));
            else finalValue += map.get(Character.toString(s.charAt(i)));
        }
        return finalValue;
//        return 5;
    }
}
