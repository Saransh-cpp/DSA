package com.company.bitManipulation;

import java.util.Scanner;

public class NumberOfUnsetBits {

    public static void main (String[] args) throws java.lang.Exception
    {
        try {

            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            int[] inputs = new int[t];
            for (int i = 0; i < t; i++) {
                inputs[i] = scanner.nextInt();
            }


            for(int j : inputs) {
                int count = 0;
                for (int i = 1; i < j; i = i << 1) {
                    if ((i & j) == 0) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            return;
        }
    }
}
