package com.company.arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,3,2};
        System.out.println("Majority element is - " + mooresApproach(arr) + " " + hashMapApproach(arr));
    }

    private static int mooresApproach(int[] arr) {
        int currentElement = arr[0];
        int currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentElement) {
                currentCount++;
            } else if (arr[i] != currentElement) {
                currentCount--;
            }

            if (currentCount == 0) {
                currentCount = 1;
                currentElement = arr[i];
            }
        }

        int finalCount = 0;
        for (int j : arr) {
            if (j == currentElement) finalCount++;
        }

        if (finalCount > arr.length / 2) return currentElement;
        else return -1;
    }

    private static int hashMapApproach(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                int count = map.get(j) + 1;
                map.put(j, count);
                if (count > arr.length / 2) {
                    return j;
                }
            } else {
                map.put(j, 1);
            }
        }
        return -1;
    }
}
