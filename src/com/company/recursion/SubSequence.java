package com.company.recursion;

public class SubSequence {
    public static void main(String[] args) {
        String str = "Hello";
        subSequence("", str);
    }

    public static void subSequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subSequence(processed + ch, unprocessed);
        subSequence(processed, unprocessed);
    }
}
