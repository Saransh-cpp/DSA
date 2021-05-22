package com.company.DSASheet;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateProblem {
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
        int one = 1;

        for (int i = 0; i + (int) (m) - one < a.size(); i++) {
            if (a.get((i + (int) (m) - one)) - a.get(i) < min) {
                min = a.get(i + (int) (m) - one) - a.get(i);
            }
        }
        return min;
    }
}
