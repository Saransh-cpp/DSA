package com.company.DSASheet;

public class MinimumSwapsRequiredBringElementsLessEqualKTogether {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 6, 3};
        int k = 3;
        int good = 0;

        for (int value : arr) {
            if (value <= k) good++;
        }

        int i;
        int j = good;
        int bad = 0;

        for (i = 0; i < good; ++i)
            if (arr[i] > k)
                ++bad;

        int ans = bad;
        i = 0;
        while (j < arr.length) {
            if (arr[i] > k) bad--;

            if (arr[j] > k) bad++;

            ans = Math.min(bad, ans);

            i++;
            j++;
        }

        System.out.println(ans);
    }
}
