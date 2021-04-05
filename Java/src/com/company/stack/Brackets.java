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
            } else if (bracSeq.charAt(i) == '}') {
                return stack.pop() == '{';
            } else if (bracSeq.charAt(i) == ')') {
                return stack.pop() == '(';
            } else if (bracSeq.charAt(i) == ']') {
                return stack.pop() == '[';
            }
        }
        return false;
    }


}
