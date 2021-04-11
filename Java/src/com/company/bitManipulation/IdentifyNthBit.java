package com.company.bitManipulation;

import java.util.Scanner;

public class IdentifyNthBit {
    public static void main(String[] args) {
        System.out.println("Enter a binary number");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        nthBit(num, n - 1);
    }

    private static void nthBit(long num, int n) {
        long mask = 1L << n;
        if ((mask & num) == 0) {
            System.out.println("0");
        } else System.out.println("1");
    }
}
