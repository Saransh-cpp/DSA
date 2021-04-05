package com.company.stack;

public class MyStack {
    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int top = -1;

    public MyStack () {
        this.data = new int[DEFAULT_SIZE];
    }

    public MyStack (int size) {
        this.data = new int[size];
    }

    public void push (int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            this.data[top] = item;
//            this.data[++top] = item;
        }
    }

    public Integer pop () {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return null;
        }
        else {
            int temp = top;
            top--;
            return data[temp];
//            return data[top--];
        }
    }

    public Integer peek () {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return null;
        } else {
            return data[top];
        }
    }

    public boolean isFull () {
        return top == this.data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
