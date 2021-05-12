package com.company.DSASheet;

import java.util.HashMap;
import java.util.Map;

public class UnionOfSortedArrays {
    public static int doUnion(int a[], int b[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.containsKey(j)) {
                int count = map.get(j) + 1;
                map.put(j, count);
            } else {
                map.put(j, 1);
            }
        }
        for (int j : b) {
            if (map.containsKey(j)) {
                int count = map.get(j) + 1;
                map.put(j, count);
            } else {
                map.put(j, 1);
            }
        }

        int count = 0;
        for (Map.Entry mapElement : map.entrySet()) {
            count++;
        }

        return count;
    }
}
