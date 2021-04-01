package com.company.recursion;

import java.util.Scanner;

public class RecursionIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = scanner.nextInt();
        printSeries(n);
        printSeriesInc(n);
    }

    public static void printSeries(int i) {
        if (i > 0) {
            System.out.println(i);
        } else return;
        printSeries(i - 1);
    }

    public static void printSeriesInc(int i) {
        if (i == 0) return;
        printSeriesInc(i - 1);
        System.out.println(i);
    }
}
