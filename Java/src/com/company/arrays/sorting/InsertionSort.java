package com.company.arrays.sorting;


import com.company.arrays.searchInArray.*;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = scanner.nextInt();

        int[] arr = LinearSearch.inputFunction(n, "Linear");

        int[] sortedArray = insertionSort(arr);

        System.out.println("Sorted array is " + Arrays.toString(sortedArray));
    }

    public static int[] insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//
//        }
        return new int[0];
    }
}
