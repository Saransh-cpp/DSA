package com.company.queue;

public class QueueUsingStackDeletionEff {
    private  int top;
    private final int DEFAULT_SIZE = 10;
    int[] data;
    int[] temp;
    int tempTop = -1;

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

        if (top == -1) {
            this.data[++this.top] = item;
            return;
        }


        this.temp = new int[this.data.length];
        for (int i = 0; i <= top; i++) {
            this.temp[++this.tempTop] = this.data[top - i];
        }
        this.top = -1;
        this.data[++this.top] = item;

        for (int i = this.tempTop; i > -1; i--) {
            this.data[++this.top] = this.temp[i];
        }
        this.tempTop = -1;
    }

    public Integer delete () {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        }
        return this.data[this.top--];
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
