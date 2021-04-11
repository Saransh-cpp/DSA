package com.company.DSASheet;

import java.util.Scanner;

public class NumberOfBitsToBeConverted {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        System.out.println("Enter another number");
        int n2 = scanner.nextInt();
        int c = n ^ n2;
        while (c != 0) {
            c &= (c-1);
            count++;
        }
        System.out.println(count);
    }
}
