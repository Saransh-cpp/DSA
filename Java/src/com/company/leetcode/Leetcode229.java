package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode229 {
    public List<Integer> majorityElement(int[] nums) {

        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
            else if (count1 == 0) {
                num1 = num;
                count1++;
            } else if (count2 == 0) {
                num2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int j : nums) {
            if (j == num1) count1++;
            else if (j == num2) count2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) ans.add(num1);
        if (count2 > nums.length / 3) ans.add(num2);

        return ans;
    }
}
