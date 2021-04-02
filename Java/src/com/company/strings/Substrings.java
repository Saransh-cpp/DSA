package com.company.strings;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();

        subStrings(str);
    }

    public static void subStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
