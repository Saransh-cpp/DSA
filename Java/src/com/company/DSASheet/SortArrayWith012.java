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
        arr = sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sort012(int[] arr) {
        int high = arr.length - 1;
        int low = 0, mid = 0, temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        return arr;
    }
}
