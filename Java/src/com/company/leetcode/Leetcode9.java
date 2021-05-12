package com.company.leetcode;

import java.util.HashMap;
import java.util.Set;

public class Leetcode9 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        System.out.println();
    }

    public static Boolean isPalindrome(int x) {
        // METHOD 1

        // if (x < 0) return false;
        // String num = Integer.toString(x);
        // for (int i = 0; i < num.length() / 2; i++) {
        //     if (num.charAt(i) != num.charAt(num.length() - 1 -i)) return false;
        // }
        // return true;

        // METHOD 2

        // if (x < 0) return false;
        // int num = x;
        // int finalNum = 0;
        // while (num > 0) {
        //     int rem = num % 10;
        //     finalNum = finalNum * 10 + rem;
        //     num /= 10;
        // }
        // return finalNum == x;

        // METHOD 3

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
