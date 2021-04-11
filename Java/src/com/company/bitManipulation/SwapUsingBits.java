package com.company.bitManipulation;

import java.util.Scanner;

public class SwapUsingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Original - n1 = " + n1 + " n2 = " + n2);
        n1 = n1 ^ n2;
        n2 = n1^ n2;
        n1 = n1 ^ n2;
        System.out.println("Swap - n1 = " + n1 + " n2 = " + n2);
    }
}
