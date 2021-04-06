package com.company.linkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(5);
        linkedList.insertAtLast(6);
        linkedList.insertAtLast(7);
        linkedList.insertAtFirst(10);
        linkedList.show();
        System.out.println(linkedList.deleteAtFirst());
        linkedList.show();
        System.out.println(linkedList.deleteAtLast());
        linkedList.show();
    }
}
