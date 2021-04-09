package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionAndIntersectionOfSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        ArrayList arr = new ArrayList();
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            int ele = scanner.nextInt();
            arr.add(ele);
        }
        System.out.println("Enter the array size");
        int n2 = scanner.nextInt();
        ArrayList arr2 = new ArrayList();
        System.out.println("Enter the array");
        for (int i = 0; i < n2; i++) {
            int ele = scanner.nextInt();
            arr2.add(ele);
        }
//        ArrayList arrList = intersection(arr, arr2);
        ArrayList unionList = union(arr, arr2);
        System.out.println("Union - " + unionList);
//        System.out.println("Intersection - " +  arrList);
    }

    private static ArrayList union(ArrayList arr, ArrayList arr2) {
        ArrayList temp = arr;
        ArrayList unionated = new ArrayList();
        for (int i = 0; i < temp.toArray().length; i++) {
            unionated.add(arr.get(i));
        }
        return null;
    }


}
