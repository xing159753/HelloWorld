package com.xing.queue.a1;

public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public static void main(String[] args) {
        Queue newQueue = new Queue();
        System.out.println("This queue has " + newQueue.size + " nodes.");
    }
}
