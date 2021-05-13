package com.company.leetcode;

public class Leetcode67 {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder;
        StringBuilder finalString = new StringBuilder();
        String lowLen;

        int carry = 0, maxLen, i, j;

        if (a.length() < b.length()) {
            maxLen = b.length();
            stringBuilder = new StringBuilder(a);
            lowLen = b;
        } else {
            maxLen = a.length();
            stringBuilder = new StringBuilder(b);
            lowLen = a;
        }

        while (stringBuilder.length() != maxLen) {
            stringBuilder.insert(0, "0");
        }

        for (i = maxLen - 1; i > -1; i--) {
            if (stringBuilder.charAt(i) == '1' && lowLen.charAt(i) == '1') {
                if (carry == 1) {
                    finalString.append("1");
                } else {
                    finalString.append("0");
                }
                carry = 1;
            } else if ((stringBuilder.charAt(i) == '0' && lowLen.charAt(i) == '1') || (stringBuilder.charAt(i) == '1' && lowLen.charAt(i) == '0')) {
                if (carry == 1) {
                    finalString.append("0");
                    carry = 1;
                } else {
                    finalString.append("1");
                    carry = 0;
                }
            } else {
                if (carry == 1) {
                    finalString.append("1");
                } else {
                    finalString.append("0");
                }
                carry = 0;
            }
        }

        finalString.reverse();

        if (carry == 1) {
            finalString.insert(0, "1");
        }
        return finalString.toString();
    }
}
