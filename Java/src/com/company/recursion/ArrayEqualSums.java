package com.company.recursion;

import java.util.ArrayList;

public class ArrayEqualSums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 4, 2, 2};

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        equalSum(first, second, 0, 0, arr, 0);
    }

    private static void equalSum(ArrayList<Integer> first, ArrayList<Integer> second, int fsum, int ssum, int[] arr, int index) {
        if (index == arr.length) {
            if (fsum == ssum) System.out.println(first + " : " + second);
            return;
        }
        int element = arr[index];

        first.add(element);
        equalSum(first, second, fsum + element, ssum, arr, index + 1);
        first.remove(first.size() - 1);

        second.add(element);
        equalSum(first, second, fsum, ssum + element, arr, index + 1);
        second.remove(second.size() - 1);
    }
}
