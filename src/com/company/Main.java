package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String s = prime(n);
        System.out.println(s);
    }

    public static String prime(int n) {
        return "Prime " + n;
    }
}
