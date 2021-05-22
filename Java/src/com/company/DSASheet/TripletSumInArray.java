package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TripletSumInArray {

    public static boolean find3NumbersEff(int A[], int n, int X) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            int start = i + 1;
            int end = A.length - 1;

            while (start < end) {
                if (A[i] + A[start] + A[end] == X) return true;
                else if (A[i] + A[start] + A[end] < X) start++;
                else end--;
            }
        }
        return false;
    }

    public static boolean find3Numbers(int A[], int n, int X) {
        int j;

        for (int i = 0; i < A.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currSum = X - A[i];
            for (j = i + 1; j < A.length; j++) {
                if (set.contains(currSum - A[j])) return true;
                set.add(A[j]);

            }

        }
        return false;
    }
}
