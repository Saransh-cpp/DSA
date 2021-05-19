package com.company.leetcode;

public class Leetcode88 {

//    Another method would be to take a windown of length (or a gap) n + m / 2 and keep reducing it by 2 till we reach 1
//    if any 2 elements are in the wrong place, swap them (remember to take ceiling of n + m / 2)
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        if (n == 0) return;

        int j;
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > nums2[0]) {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;

                int first = nums2[0];
                for (j = 1; j < n; j++) {
                    if(nums2[j] <= first) {
                        flag = true;
                        nums2[j - 1] = nums2[j];
                    } else if (nums2[j] > first) break;
                }
                if (flag) nums2[j - 1] = first;
            }
        }

        for (int i = m, k = 0; k < n; i++, k++) {
            nums1[i] = nums2[k];
        }
    }
}
