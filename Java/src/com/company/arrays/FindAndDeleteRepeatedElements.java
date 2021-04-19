package com.company.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAndDeleteRepeatedElements {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        deletedElementsArr(arr);
        }

    private static void deletedElementsArr(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = arr.length;
        int i = 0;
        while (i < size){
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
                for (int j = i; j < arr.length - 1; j++) {
                    arr [j] = arr[j + 1];
                }
                size--;
                if (map.get(arr[i]) == null) {
                    map.put(arr[i], 1);
                    i++;
                }
            } else {
                map.put(arr[i], 1);
                i++;
            }
        }

        int finalCount = 0;

        for (Map.Entry mapElement : map.entrySet()) {
            int value = (int) mapElement.getValue();
            if (value > 1) {
                finalCount++;
            }
        }
        System.out.println("Number of repeated elements are - " + finalCount);

        System.out.print("New Array is - ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
