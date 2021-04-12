package com.company.DSASheet;

import java.util.Scanner;

public class CopySetBitsInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num 2");
        int num2 = scanner.nextInt();
        System.out.println("Enter lower range");
        int l = scanner.nextInt();
        System.out.println("Enter upper bound");
        int u = scanner.nextInt();

        int ouput = copySetBits(num1, num2, l, u);
        System.out.println(ouput);
    }

    private static int copySetBits(int num1, int num2, int l, int u) {
        for (int i = l; i <= u; i++) {
            int mask = 1 << (i - 1);
            if ((mask & num2) != 0) {
                num1 = num1 | mask;
            }
        }
        return num1;
    }
}
