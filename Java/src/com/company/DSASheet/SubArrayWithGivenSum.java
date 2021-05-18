package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,7,5};
//        int[] arr = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        System.out.println(Arrays.toString(subarraySum(arr, 5, 12).toArray()));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int currSum = arr[0], start = 0, i;
        ArrayList<Integer> res = new ArrayList<>();

        for (i = 1; i <= arr.length; i++) {
            while (currSum > s && start < i - 1) {
                currSum -= arr[start++];
            }


            if (currSum == s) {
                res.add(start + 1);
                res.add(i);
                return res;
            }

            if (i < n) currSum = currSum + arr[i];
        }
        res.add(-1);
        return res;
    }
}
