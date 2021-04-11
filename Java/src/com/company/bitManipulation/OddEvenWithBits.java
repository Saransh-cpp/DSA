package com.company.bitManipulation;

import java.util.Scanner;

public class OddEvenWithBits {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = OddEvenWithBits.scanner.nextInt();
        boolean isEven = checkEven(n);
        if (isEven) System.out.println("Even");
        else System.out.println("Odd");
    }

    private static boolean checkEven(int n) {
        return (n & 1) == 0;
    }

}
