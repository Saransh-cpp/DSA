package com.company.DSASheet;

import java.util.ArrayList;

public class TwoRepeatingElementsInAnArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 1};
        System.out.println(twoRepeated(a));
    }

    // Maths.abs method
    public static ArrayList<Integer> twoRepeated(int arr[]){

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            } else {
                arrayList.add(Math.abs(arr[i]));
            }
        }
        return arrayList;
    }

    // More methods -
    // 1. Nested for
    // 2. HashMap
    // 3. sum and multiplication -> 2 equations
    // 4. XOR operation
}
