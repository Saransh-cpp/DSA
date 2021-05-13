package com.company.leetcode;

public class Leetcode204 {
    public int countPrimes(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = 1;
        }
        arr[0] = 0;
        if (arr.length > 1) {
            arr[1] = 0;
        }
        for (int i = 2; i * i <= n ; i++) {
            if (arr[i] != 0) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
}
