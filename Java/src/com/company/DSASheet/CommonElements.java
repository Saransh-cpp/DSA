package com.company.DSASheet;

import java.util.ArrayList;

public class CommonElements {

    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{3, 5}, new int[]{1}, new int[]{2}));
    }

//    A similar approac can be used to calculate intersection and union of sorted arrays
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[])  {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length && k < C.length) {
            if (A[i] == B[j] && B[j] == C[k]) {
                res.add(A[i]);
            }

            if (A[i] > B[j]) {
                j++;
            } else if (B[j] > C[k]) {
                k++;
            } else i++;
        }

        if (res.isEmpty()) {
            res.add(-1);
            return res;
        }

        int currElement = res.get(0);
        i = 1;
        while (i < res.size()) {
            if (res.get(i) == currElement) res.remove(i);
            else {
                currElement = res.get(i);
                i++;
            }
        }

        return res;
    }

//    Won't work if elements repeat in a single array, you can first clear them out and then do this but lengthy
//    public static ArrayList<Integer> commonElements(int A[], int B[], int C[])  {
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int j : A) {
//            res.add(j);
//        }
//
//        for (int j : B) {
//            res.add(j);
//        }
//
//        for (int j : C) {
//            res.add(j);
//        }
//
//        Collections.sort(res);
//
//        System.out.println(res);
//        for (int i = 0; i < res.size() - 3; i++) {
//            if (!res.get(i).equals(res.get(i + 1)) || !res.get(i).equals(res.get(i + 2))) {
//                res.remove(i);
//                i--;
//            }
//        }
//
//        if (!res.get(res.size() - 3).equals(res.get(res.size() - 2)) || !res.get(res.size() - 2).equals(res.get(res.size() - 1))) {
//            res.remove(res.size() - 1);
//            res.remove(res.size() - 1);
//            res.remove(res.size() - 1);
//        } else {
//            res.remove(res.size() - 1);
//            res.remove(res.size() - 1);
//        }
//
//        if (res.isEmpty()) {
//            res.add(-1);
//            return res;
//        }
//        int currElement = res.get(0);
//        int i = 1;
//        while (i < res.size()) {
//            if (res.get(i) == currElement) res.remove(i);
//            else {
//                currElement = res.get(i);
//                i++;
//            }
//        }
//
//        return res;
//    }
}
