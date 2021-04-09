package com.company.DSASheet;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String n = scanner.nextLine();
        System.out.println("Initial string - " + n);
        n = reverseString(n);
        System.out.println("Reversed string - " + n);
    }

    public static String reverseString(String n) {
        char[] in = n.toCharArray();
        for (int i = 0; i < in.length / 2; i++) {
            char temp = in[i];
            in[i] = in[in.length - 1 - i];
            in[in.length - 1 - i] = temp;
        }
        return new String(in);
    }
}
