package com.company.arrays.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 3, 5, 5};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Sorted array - " + Arrays.toString(quickSort(arr, low, high)));
    }

    private static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        System.out.println(Arrays.toString(arr));
        return new int[0];
    }

    public static int partition (int[] arr, int low, int high) {
        int pivot = arr[arr.length / 2];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = low;
        low = arr[j];
        arr[j] = temp;
        return j;
    }
}
