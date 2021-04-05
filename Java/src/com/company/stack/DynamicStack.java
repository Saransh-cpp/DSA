package com.company.stack;

public class DynamicStack extends MyStack {
    @Override
    public void push(int item) {
        if (isFull()) {
            int[] temp = new int[this.data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            this.data = temp;
        }
        super.push(item);
    }
}
