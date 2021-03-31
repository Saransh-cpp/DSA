package com.company.arrays.searchInArray;

import java.util.Scanner;

public class BinarySearch {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of array");
        int n = scanner.nextInt();

        int[] arr = LinearSearch.inputFunction(n, "binary");

        System.out.println("Enter element to be searched");
        int element = scanner.nextInt();
        boolean isFound = binarySearch(arr, element);
        if (!isFound) {
            System.out.println("Element not present");
        }
    }

    private static boolean binarySearch(int[] arr, int element) {
        int a = 0;
        int b =  arr.length - 1;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (element == arr[mid]) {
                System.out.println("Element present at position " + (mid+1));
                return true;
            } else if (element > arr[mid]) {
                a = mid + 1;
            } else if (element < arr[mid]) {
                b = mid - 1;
            }
        }
        return false;
    }
}
