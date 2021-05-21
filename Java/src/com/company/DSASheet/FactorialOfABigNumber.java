package com.company.DSASheet;

import java.util.ArrayList;

public class FactorialOfABigNumber {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer> res = new ArrayList<>();

        int carry = 0;
        for (int i = 2; i <= n; i++) {
            if (res.isEmpty()) {
                res.add(2);
                continue;
            }

            int j = res.size() - 1;
            while (j > -1) {
                int num = res.get(j) * i + carry;
                carry = num / 10;
                res.set(j, num % 10);

                j--;
            }

            if (carry != 0) {
                res.add(0, carry);
                carry = 0;
            }
        }
        System.out.println(res);
    }
}

