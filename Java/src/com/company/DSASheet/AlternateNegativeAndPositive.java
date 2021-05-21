package com.company.DSASheet;

import java.util.Arrays;

public class AlternateNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{-5, -2, 5, 2, 4, 7, 1, -8, 0, -8 };
        int wrongIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (wrongIndex >= 0) {
                if ((arr[wrongIndex] >= 0 && arr[i] < 0) || arr[wrongIndex] < 0 && arr[i] >= 0) {
                    int temp = arr[i];
                    for (int j = i; j > wrongIndex; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[wrongIndex] = temp;

                    if (i - wrongIndex >= 2)
                        wrongIndex = wrongIndex + 2;
                    else
                        wrongIndex = -1;

                }
            }
            if (wrongIndex == -1) {
                if ((i % 2 == 0 && arr[i] > 0) || (i % 2 == 1 && arr[i] < 0)) {
                    wrongIndex = i;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
