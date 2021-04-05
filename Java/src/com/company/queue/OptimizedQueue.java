package com.company.queue;

public class OptimizedQueue {
    private int end = -1;

    private int[] data;
    private final int DEFAULT_SIZE = 10;

    OptimizedQueue () {
        data = new int[DEFAULT_SIZE];
    }

    OptimizedQueue (int size) {
        data = new int[size];
    }

    public void add (int item) {
        if (isFull()) {
            System.out.println("Queue full");
        }
        else this.data[++end] = item;
    }

    public Integer delete () {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return null;
        }

        if (end == 0) {
            return this.data[end--];
        }

        int temp = this.data[0];
        for (int i = 0; i < end; i++) {
            this.data[i] = this.data[i + 1];
        }
        return temp;
    }

    public boolean isFull() {
        return end == data.length - 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }
}
