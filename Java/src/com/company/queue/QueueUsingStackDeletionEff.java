package com.company.queue;

public class QueueUsingStackDeletionEff {
    private  int top;
    private final int DEFAULT_SIZE = 10;
    int[] data;
    int[] temp;

    QueueUsingStackDeletionEff () {
        this.data = new int[DEFAULT_SIZE];
        this.top = -1;
    }

    QueueUsingStackDeletionEff (int size) {
        this.data = new int[size];
        this.top = -1;
    }

    public void add (int item) {
        if (isFull()) {
            System.out.println("Queue full");
            return;
        }

        this.data[++this.top] = item;
        this.temp = new int[this.data.length];
        for (int i = this.top; i > -1; i--) {
            temp[temp.length - 1 - i] = this.data[i];
        }
    }

    public Integer delete () {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        }
        int[] temp = new int[this.data.length];
        for (int i = this.top; i > -1; i--) {
            temp[temp.length - 1 - i] = this.data[i];
        }
        int element = temp[top];
        this.top--;
        for (int i = this.top; i > -1; i--) {
            this.data[this.data.length - i - 2] = temp[i];
        }
        return element;
    }

    public void show () {
        for (int i = 0; i <= this.top; i++) {
            System.out.println(this.data[i]);
        }
    }

    public boolean isEmpty() {
        return this.data.length == 0;
    }

    public boolean isFull() {
        return this.top == this.data.length - 1;
    }
}
