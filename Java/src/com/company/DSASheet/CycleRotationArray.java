package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class CycleRotationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        long[] arr = new long[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Initial array - " + Arrays.toString(arr));
        arr = rotate(arr);
        System.out.println("Final array - " + Arrays.toString(arr));
    }

    private static long[] rotate(long[] arr) {
        long[] temp = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                temp[0] = arr[i];
            } else {
                temp[i + 1] = arr[i];
            }
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
        StringBuilder output = new StringBuilder();
        for (long l : arr) {
            output.append(l).append(" ");
        }
        System.out.println("Output - " + output);
        return arr;
    }
}
