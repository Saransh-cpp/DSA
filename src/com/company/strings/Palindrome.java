package com.company.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        palindrome(str);
    }

    public static void palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 -i)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
