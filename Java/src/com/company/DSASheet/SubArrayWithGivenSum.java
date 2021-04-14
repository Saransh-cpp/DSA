package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(subarraySum(arr, 10, 15).toArray()));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int currSum = arr[0], start = 0, i;
        ArrayList<Integer> res = new ArrayList<>();

        for (i = 1; i <= arr.length; i++) {
            while (currSum > s && start < i - 1) {
                currSum -= arr[start];
                start++;
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
