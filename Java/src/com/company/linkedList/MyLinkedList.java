package com.company.linkedList;

public class MyLinkedList {
    Node head, tail;
    int size = 0;

    static class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }

        Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst (int item) {
        Node node = new Node(item, head);
        head = node;
        if (size == 0) {
            tail = node;
        }
        size++;
    }

    public void insertAtLast (int item) {

        Node node = new Node(item);
        if (size == 0) {
            insertAtFirst(item);
            return;
        }
        tail.next = node;
        tail = node;

        size++;
    }

    public void show () {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
    }

}
