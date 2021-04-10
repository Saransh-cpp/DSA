package com.company.DSASheet;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.nextLine();
        boolean isPalindrome = checkPalindrome(s);
        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean optimisedCheckPalindrome (String S) {
        int l = 0;
        int h = S.length() - 1;
        while (h > l) {
            if (S.charAt(l++) != S.charAt(h--)) {
                return false;
            }
        }
        return true;
    }
}
