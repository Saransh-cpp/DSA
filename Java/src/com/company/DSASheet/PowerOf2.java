package com.company.DSASheet;

public class PowerOf2 {
    boolean isPowerofTwo(long n){
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
