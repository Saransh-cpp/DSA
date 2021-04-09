package com.company.DSASheet;

import java.util.Scanner;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = maxElement(arr);
        int min = minElement(arr);
        System.out.println("Max - " + max + " Min - " + min);
    }

    private static int minElement(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int maxElement(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
