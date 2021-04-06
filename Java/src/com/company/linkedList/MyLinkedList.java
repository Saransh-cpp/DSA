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

    public Integer deleteAtFirst () {
        if (size == 0) {
            System.out.println("Empty list");
            return null;
        }
        int temp = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }

        return temp;
    }

    public Integer deleteAtLast () {
        if (size <= 1) {
            return deleteAtFirst();
        }
        Node node = head;
        while (node.next != tail) {
            node = node.next;
        }
        int temp = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return temp;
    }

    public int mid () {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public void show () {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println();
    }

}
