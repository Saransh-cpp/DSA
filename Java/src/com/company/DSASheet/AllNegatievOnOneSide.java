package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class AllNegatievOnOneSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = negativeMOVE(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] negativeMOVE(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] < 0) {
                while (arr[high] < 0) high--;
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
            low++;
            high--;
        }
        return arr;
    }
}
