package com.company.stack;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();

        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(7);
        stack.push(7);
        stack.push(7);
        stack.push(9);
        stack.push(8);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
