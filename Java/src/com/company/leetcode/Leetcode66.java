package com.company.leetcode;

public class Leetcode66 {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }



        int carry = 1;
        int i = digits.length - 1;
        while (carry != 0) {
            if (i == digits.length - 1) {
                digits[i] = 0;
                carry = 1;
            } else if (i < 0) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                for (int j = 0; j < digits.length; j++){
                    newArr[j + 1] = digits[j];
                }
                return newArr;
            } else if (digits[i] == 9 && carry == 1) {
                digits[i] = 0;
                carry = 1;
            } else if (carry == 1) {
                digits[i] += 1;
                carry = 0;
            }
            i--;
        }
        return digits;
    }
}
