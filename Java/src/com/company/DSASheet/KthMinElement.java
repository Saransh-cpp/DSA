package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class KthMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter k");
        int k = scanner.nextInt();
        int kthMin = kthMinElement(arr, k);
        System.out.println(kthMin);
    }

    private static int kthMinElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
