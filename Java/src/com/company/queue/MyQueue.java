package com.company.queue;

public class MyQueue {
    private int end = -1;
    private int start = -1;
    int[] data;
    int DEFAULT_SIZE = 10;

    MyQueue () {
        data = new int[DEFAULT_SIZE];
    }

    MyQueue (int size) {
        data = new int[size];
    }

    public void add (int item) {
        if (isFull()) {
            System.out.println("Queue full");
        } else if (start == -1) {
            start = 0;
            end = 0;
            data[0] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public Integer delete () {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        } else if (end == 0) {
            end--;
            return data[start--];
        } else {
            return data[start++];
        }
    }

    public Integer peek () {
        return data[start];
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean isFull() {
        return end == data.length - 1;
    }
}
