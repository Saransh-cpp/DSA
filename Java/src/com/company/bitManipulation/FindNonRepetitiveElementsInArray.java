package com.company.bitManipulation;

import java.util.Scanner;

public class FindNonRepetitiveElementsInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] inputs = new int[t];
        for (int i = 0; i < t; i++) {
            inputs[i] = scanner.nextInt();
        }

        int zero = 0;
        for(int i = 0; i < t; i++) {
            inputs[i] = inputs[i] ^ (~zero);

        }

        for(int j : inputs) {
            int count = 0;
            while (j != 0) {
                j = j & (j - 1);
                count++;
            }
            System.out.println(count);
        }

// 		int idx = 0;
// 		int count = 0;

// 		while (arr[idx] != 0 || idx != arr.length) {
// 		    arr[idx] = arr
// 		}
    }
}
