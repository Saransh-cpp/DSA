package com.company.DSASheet;

public class CountInversions {

//    O(n^2) method, other one requires merge sort
    static long inversionCount(long arr[], long N) {

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) count++;
            }
        }

        return count;
    }
}
