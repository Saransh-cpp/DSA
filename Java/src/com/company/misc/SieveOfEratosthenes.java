package com.company.misc;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            for (int j = 2 * i; j <= n; j+=i) {
                if (isPrime[j]) isPrime[j] = false;
            }
        }

        System.out.println(Arrays.toString(isPrime));
    }
}
