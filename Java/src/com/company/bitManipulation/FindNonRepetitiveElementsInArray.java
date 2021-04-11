package com.company.bitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonRepetitiveElementsInArray {

    public static int[] singleNumber(int[] nums)
    {
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }

        int i = 1;
        int counter = 1;
        while (true) {
            if ((sum & i) == 1) {
                counter++;
                break;
            }
            i = i<<1;
            counter++;
        }
        int num1 = 0;
        int num2 = 0;
        i = 1 << counter;
        for (int j : nums) {
            if ((i & j) == 0) {
                num1 = j ^ num1;
            } else {
                num2 = j ^ num2;
            }
        }

        int[] sol = {num1, num2};
        Arrays.sort(sol);
        return sol;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Unique elements: " + Arrays.toString(singleNumber(arr)));
    }
}
