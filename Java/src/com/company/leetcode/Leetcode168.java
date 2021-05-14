package com.company.leetcode;

public class Leetcode168 {

    public static void main(String[] args) {
        System.out.println(convertToTitle(11));
    }

    public static String convertToTitle(int cn) {
        var builder = new StringBuilder();
        while (cn-- > 0) {
            builder.insert(0, (char)((cn % 26) + 'A'));
            cn /= 26;
        }
        return builder.toString();
    }
}
