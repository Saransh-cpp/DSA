package com.company.arrays.sorting;

import com.company.arrays.searchInArray.binarySearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = scanner.nextInt();

        int[] arr = LinearSearch.inputFunction(n, "Linear");

        int[] sortedArray = selectionSort(arr);

        System.out.println("Sorted array is " + Arrays.toString(sortedArray));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}
