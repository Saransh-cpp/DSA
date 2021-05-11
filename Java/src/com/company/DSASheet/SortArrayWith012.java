package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWith012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = sortMethod2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortMethod2(int[] a) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int j : a) {
            if (j == 0) {
                c0++;
            } else if (j == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        int i = 0;
        while (c0 > 0) {
            a[i++] = 0;
            c0--;
        }

        while (c1 > 0) {
            a[i++] = 1;
            c1--;
        }

        while (c2 > 0) {
            a[i++] = 2;
            c2--;
        }

        return a;
    }

    private static int[] sort012(int[] arr) {
        int high = arr.length - 1;
        int low = 0, mid = 0, temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
        return arr;
    }
}
