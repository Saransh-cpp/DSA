package com.company.DSASheet;

import java.util.HashMap;
import java.util.Map;

public class PairsWithGivenSum {

    public static void main(String[] args) {
        System.out.println(getPairsCount(new int[]{1, 1, 1, 1}, 2));
    }

    public static int getPairsCount(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int j : arr) {
            if (!map.containsKey(j)) map.put(j, 0);
            map.put(j, map.get(j) + 1);
        }

        for (int j : arr) {
            if (map.get(k - j) != null) {
                count += map.get(k - j);
            }

            if (k - j == j)
                count--;
        }

        return count / 2;
    }
}
