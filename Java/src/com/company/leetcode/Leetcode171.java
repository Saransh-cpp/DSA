package com.company.leetcode;

public class Leetcode171 {

    public static int findColumnNumber (String columnTitle) {
        int total = 0;
        int len = columnTitle.length() - 1;
        int count = 0;
        while (len >= 0) {

            int a = (columnTitle.charAt(len) - 'A') + 1;
            total += Math.pow(26, count) * a;
            len--;

            count++;
        }
        return total;
    }
}
