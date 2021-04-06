package com.company.queue;

public class MyQueue {
    private int end = -1;
    private int start = -1;
    int[] data;

    MyQueue () {
        final int DEFAULT_SIZE = 10;
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
            this.data[0] = item;
        } else {
            end++;
            this.data[end] = item;
        }
    }

    public Integer delete () {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        } else if (end == 0) {
            end--;
            return this.data[start--];
        } else {
            return this.data[start++];
        }
    }

    public Integer peek () {
        return this.data[start];
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean isFull() {
        return end == data.length - 1;
    }
}
