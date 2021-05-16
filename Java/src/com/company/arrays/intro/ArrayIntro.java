package com.company.arrays.intro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter element " + i);
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = 0;
        right[height.length - 1] = 0;
        int max;

        for (int i = 1; i < height.length; i++) {
            left[i] = height[i - 1];
        }

        for (int i = height.length - 2; i > -1; i--) {
            right[i] = height[i + 1];
        }

        max = 0;
        for (int i = 1; i < height.length - 1; i++) {
            if (((Math.abs(left[i] - right[i])) - height[i]) > 0) {
                max += Math.abs(left[i] - right[i]) - height[i];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
