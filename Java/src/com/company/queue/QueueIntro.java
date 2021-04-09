package com.company.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
        QueueUsingStackDeletionEff queue = new QueueUsingStackDeletionEff();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
//        queue.add(10);
        queue.show();
//        queue.add(11);
        System.out.println(queue.delete());
        System.out.println(queue.isEmpty());
        queue.add(20);
        System.out.println(queue.isEmpty());
        System.out.println(queue.delete());
        queue.show();
//        System.out.println(queue.delete());
//        System.out.println(queue.delete());
//        System.out.println(queue.delete());
        queue.show();
        System.out.println(queue.delete());

//        System.out.println(queue.delete());

//        System.out.println(queue.delete());

//        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
