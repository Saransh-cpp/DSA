package com.company.DSASheet;

import java.util.HashMap;
import java.util.Map;

public class ElementOccuringMoreThanNuponKTimes {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,2,3,4,5,5};
        int k = 6;
        System.out.println("Number of elements occurring more that N/K times is - " + countOccurrence(arr, arr.length, k));
    }

    public static int countOccurrence(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                int count = map.get(j) + 1;
                map.put(j, count);
            } else {
                map.put(j, 1);
            }
        }

        int finalCount = 0;

        for (Map.Entry mapElement : map.entrySet()) {
            int value = (int)mapElement.getValue();

            if (value > n / k) {
                finalCount++;
            }
        }
        return finalCount;
    }
}
