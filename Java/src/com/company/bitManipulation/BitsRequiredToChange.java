package com.company.bitManipulation;

import java.util.Scanner;

public class BitsRequiredToChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = scanner.nextInt();
        System.out.println("Enter another binary number");
        int n2 = scanner.nextInt();
        findNumberOfDigitsToChange(n, n2);
    }

    private static void findNumberOfDigitsToChange(int n, int n2) {
        int mask = n ^ n2;
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
