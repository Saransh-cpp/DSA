package com.company.stack;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of brackets");
        String bracSeq = scanner.next();

        boolean isValid = checkBrackets(bracSeq);
        if (isValid) System.out.println("The given sequence is valid");
        else System.out.println("The given sequence is invalid");
    }

    public static boolean checkBrackets(String bracSeq) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < bracSeq.length(); i++) {
            if (bracSeq.charAt(i) == '{' || bracSeq.charAt(i) == '(' || bracSeq.charAt(i) == '[') {
                stack.push(bracSeq.charAt(i));
            } else {
                char c = findBracket(bracSeq.charAt(i));
                char ch = stack.pop();
                if (ch != c) {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }

    private static char findBracket(char c) {
        if (c == '}') {
            return '{';
        } else if (c == ']') {
            return '[';
        } else {
            return '(';
        }
    }
}
