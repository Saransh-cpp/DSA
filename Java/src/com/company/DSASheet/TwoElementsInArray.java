package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class TwoElementsInArray {
    public static int[] singleNumber(int[] nums)
    {
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }

        int i = 1;
        int counter = 0;
        while (true) {
            if ((sum & i) == 1) {
                break;
            }
            i = i<<1;
            counter++;
        }
        System.out.println(counter);
        int num1 = 0;
        int num2 = 0;
        i = 1 << counter;
        for (int j : nums) {
            if ((i & j) == 0) {
                num1 = j ^ num1;
                System.out.println("yes " + num1);
            } else {
                num2 = j ^ num2;
            }
        }

        int[] sol = {num1, num2};
        Arrays.sort(sol);
        return sol;

    }

    public static int[] singleNumberOpt (int[] arr) {

        int sum = 0;
        for (int j :
                arr) {
            sum = sum ^ j;
        }
        int num2 = sum;
        sum = sum & (-sum);
        int num1 = 0;
        for (int j :
                arr) {
            if ((sum & j) == 0) {
                num1 = num1 ^ j;
            }
        }
        num2 = num2 ^ num1;
        int[] sol = new int[]{Math.min(num1, num2), Math.max(num1, num2)};
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

        System.out.println("Unique elements: " + Arrays.toString(singleNumberOpt(arr)));
    }
}
