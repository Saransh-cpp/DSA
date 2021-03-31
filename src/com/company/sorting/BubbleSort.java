package com.company.sorting;

import com.company.arrays.searchInArray.binarySearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        int[] arr = LinearSearch.inputFunction(n, "Linear");
        int[] sortedArray = bubbleSort(arr);

//        System.out.println("Un-sorted array is " + Arrays.toString(arr));
        System.out.println("Sorted array is " + Arrays.toString(sortedArray));
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp =  arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
