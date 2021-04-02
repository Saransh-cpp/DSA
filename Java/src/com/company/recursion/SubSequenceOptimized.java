package com.company.recursion;

public class SubSequenceOptimized {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        StringBuilder empty = new StringBuilder("");
        subSequence(empty, str);
    }

    public static void subSequence(StringBuilder processed, StringBuilder unprocessed) {
        if (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed.deleteCharAt(0);

        subSequence(processed.append(ch), unprocessed);
        processed.delete(processed.length() - 1, processed.length());

        subSequence(processed, unprocessed);
        unprocessed.insert(0, ch);
    }
}
