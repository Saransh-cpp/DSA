package com.company.DSASheet;

import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            n &= (n-1);
            count++;
        }
        System.out.println(count);
    }
}
