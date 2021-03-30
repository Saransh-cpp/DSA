package com.company.arrays.searchInArray.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int n;
        System.out.println("Enter size of array");
        n = scanner.nextInt();

        int[] arr = inputFunction(n, "Linear");
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

    public static int[] inputFunction(int n, String mode) {
        int[] arr = new int[n];
        if (mode.equals("Linear")) {
            System.out.println("Enter elements of the array");
        } else {
            System.out.println("Enter elements of a sorted array");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
