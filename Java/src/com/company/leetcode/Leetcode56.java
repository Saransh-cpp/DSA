package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//        OR -> Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() -  1)[1] < interval[0]) {
                merged.add(interval);
            }
            else {
                merged.get(merged.size() -  1)[1] = Math.max(merged.get(merged.size() -  1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
