package com.xing.queue.a4;

public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();

        this.maxSize = maxSize;
    }

    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size++;
        System.out.println("Added " + data + "! Queue size is now " + this.size);
    }

    //Define dequeue() below
    public String dequeue() {
        String data = this.queue.removeHead();
        this.size--;
        System.out.println("Removed " + data + "! Queue size is now " + this.size);
        return data;
    }

    //Define peek() below
    public String peek() {
        return this.queue.head.data;
    }

    public static void main(String[] args) {

        Queue smoothieOrders = new Queue();
        smoothieOrders.enqueue("strawberry banana");
        smoothieOrders.enqueue("chocolate peanut butter");
        System.out.println("Blending the smoothie...");
        smoothieOrders.dequeue();
        smoothieOrders.dequeue();
        System.out.println("All orders are complete!");
    }
}
