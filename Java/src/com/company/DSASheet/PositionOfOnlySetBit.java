package com.company.DSASheet;

public class PositionOfOnlySetBit {

    static int findPosition(int N) {
        int count = 1;
        if (!((N > 0) && (N & (N - 1)) == 0)) {
            return -1;
        }
        int i = 1;
        while ((N & i) == 0) {
            i = i << 1;
            count++;
        }
        return count;
    }

    static int finPositionOpt(int N) {
        int count = 0;
        if (!((N > 0) && (N & (N - 1)) == 0)) {
            return -1;
        }
        while (N > 0) {
            N = N >> 1;
            count++;
        }
        return count;
    }

    static int findPositionMegaOpt (int N) {
        if (!((N > 0) && (N & (N - 1)) == 0)) {
            return -1;
        } else return (int) (Math.floor(Math.log(N)/Math.log(2)) + 1);
    }

    public static void main(String[] args) {
        System.out.println(findPosition(2));
    }
}
