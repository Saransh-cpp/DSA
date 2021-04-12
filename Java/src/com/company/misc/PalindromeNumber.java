package com.company.misc;

public class PalindromeNumber {
    public static String is_palindrome(int n)
    {
        int origNum = n;
        int newNum = 0;
        while (n != 0) {
            int rem = n%10;
            newNum = (newNum*10) + rem;
            n /= 10;
        }
        if (newNum == origNum) return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        System.out.println(is_palindrome(555));
    }
}
