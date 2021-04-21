package com.company.DSASheet;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSum0 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4 ,5};
        System.out.println(findsum(a, a.length));
    }

    static boolean findsum(int[] arr, int n) {
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int j : arr) {
            sum += j;

            if (j == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }
        return false;
    }
}
