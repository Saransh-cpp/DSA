package com.company.DSASheet;

public class SetBitsFrom1ToN {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                temp = temp & (temp - 1);
                count++;
            }
        }
        System.out.println(count);
    }
}
