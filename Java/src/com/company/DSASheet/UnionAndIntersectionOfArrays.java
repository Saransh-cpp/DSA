package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the array size");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the array");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        ArrayList arrList = intersection(arr, arr2);
//        arr2 = union(origarr, arr2);
        System.out.println(arrList);
    }

    private static ArrayList intersection(int[] arr, int[] arr2) {
        ArrayList intersected = new ArrayList();
        for (int j : arr) {
            for (int k : arr2) {
                if (j == k) {
                    if (!intersected.contains(k)) intersected.add(k);
                    break;
                }
            }
        }
        return intersected;
    }
}
