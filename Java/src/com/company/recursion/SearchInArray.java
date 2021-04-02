package com.company.recursion;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter element to be searched");

        int element = scanner.nextInt();
        boolean isFound = searchUsingRecursion(arr, element, 0);

        if (isFound) System.out.println("Element exists");
        else System.out.println("Element doesn't exist");
    }

    private static boolean searchUsingRecursion(int[] arr, int element, int index) {
        if (index == arr.length) return false;
        if (arr[index] == element) return true;
        return searchUsingRecursion(arr, element, index + 1);
    }
}
