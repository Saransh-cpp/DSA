package com.company.bitManipulation;

import java.util.Scanner;

public class SetNthBit {
    public static void main(String[] args) {
        System.out.println("Enter a binary number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(setNthBit(num, n - 1)));
    }

    private static int setNthBit(long num, int n) {
        int mask = 1 << n;
        return mask | n;
    }
}
