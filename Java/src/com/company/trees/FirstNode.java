package com.company.trees;

public class FirstNode {
    public int data;
    FirstNode left;
    FirstNode right;

    FirstNode (int data) {
        this.data = data;
    }
}

class Tree {
    public static void main(String[] args) {
        FirstNode root = new FirstNode(10);
        root.right = new FirstNode(6);
        root.left = new FirstNode(5);
    }
}
