package com.company.leetcode;

public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(
                2147395599));
    }
    public static int mySqrt(int x) {
        long low = 0;
        long high = x;
        long mid = (low + high) / 2;
        while (low <= high) {
            if (mid * mid > x) {
                high = mid - 1;
            } else if (mid * mid < x) {
                if ((mid + 1) * (mid + 1) > x) {
                    return (int) mid;
                }
                low = mid + 1;
            } else {
                return (int) mid;
            }
            mid = (low + high) / 2;
        }
        return (int) mid;
    }
}
