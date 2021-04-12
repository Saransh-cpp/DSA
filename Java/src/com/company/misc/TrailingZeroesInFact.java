package com.company.misc;

public class TrailingZeroesInFact {
    static int trailingZeroes(int N){
        int res = 0;
        for (int i = 5; i <= N; i*=5) {
            res = res + N/i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
    }
}
