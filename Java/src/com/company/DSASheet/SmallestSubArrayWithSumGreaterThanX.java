package com.company.DSASheet;

public class SmallestSubArrayWithSumGreaterThanX {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4 ,5};
        int x = 6;
        System.out.println("Min length - " + minLengthFunc(a, x));
    }

    private static int minLengthFunc(int[] a, int x) {
        int minLength = a.length;
        int currSum = 0;
        int end = 0;
        int start = 0;

        while (end < a.length) {
            while (currSum <= x && end < a.length) {
                currSum += a[end++];
            }

            while (currSum > x && start < a.length) {
                if (end - start < minLength) {
                    minLength = end - start;
                }

                currSum -= a[start++];
            }
        }

        return minLength;
    }
}
