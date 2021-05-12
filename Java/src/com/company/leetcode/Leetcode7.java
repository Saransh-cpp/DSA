package com.company.leetcode;

public class Leetcode7 {
    public int reverse(int x) {
        int newNum = 0;
        int sign = 1;
        if (x < 0) {
            x = -x;
            sign = -1;
        }
        // try {
        while (x != 0) {
            int rem = x % 10;
            newNum = newNum * 10 + rem;
            x /= 10;
            if (newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE) return 0;

            // }
            // } catch (NumberFormatException e) {
            //     return 0;
            // }

        }
        return newNum * sign;

    }
}
