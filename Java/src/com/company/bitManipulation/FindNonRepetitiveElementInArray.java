package com.company.bitManipulation;

import java.util.Scanner;

public class FindNonRepetitiveElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int initial = 0;
        for (int j : arr) {
            initial = initial ^ j;
        }

        System.out.println("Unique element: " + initial);
    }
}
