package com.company.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int n;
        System.out.println("Enter size of array");
        n = scanner.nextInt();

        int[] arr = inputFunction(n);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the element to be searched");
        int element = scanner.nextInt();
        boolean isFound = linearSearch(arr, element);

        if (isFound) {
            System.out.println("The element is present");
        } else {
            System.out.println("No, the element is not present");
        }
    }

    public static boolean linearSearch(int[] arr, int element) {
        for (int j : arr) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] inputFunction(int n) {
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
