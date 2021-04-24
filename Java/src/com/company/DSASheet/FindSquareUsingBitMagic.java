package com.company.DSASheet;

public class FindSquareUsingBitMagic {

    public static void main(String[] args) {
        int num = 25;
        System.out.println("Square: " + findSquareUsingBitMagic(num));
    }

    private static int findSquareUsingBitMagic(int num) {
        if (num == 0) {
            return 0;
        }

        if (num < 0) {
            num = -num;
        }

        int numDividedByTwo = num >> 1;

        if ((num & 1) == 0) {
            return findSquareUsingBitMagic(numDividedByTwo) << 2;
        } else {
            return (findSquareUsingBitMagic(numDividedByTwo) << 2) + (numDividedByTwo << 2) + 1;
        }
    }
}
