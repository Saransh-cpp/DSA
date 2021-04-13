package com.company.arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 4, 4};
        System.out.println("Majority element is - " + hashMapApproach(arr));
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
