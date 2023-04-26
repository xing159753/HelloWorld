package com.xing.stack.a4;

public class Stack {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void push(String data) {
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    //Define pop() below
    public String pop() {
        String data = this.stack.removeHead();
        this.size++;
        System.out.println("Removed " + data + "! Stack size is now " + this.size);
        return data;
    }

    //Define peek() below
    public String peek() {
        return this.stack.head.data;
    }

    public static void main(String[] args) {

        Stack bracelets = new Stack();
        bracelets.push("silver");
        bracelets.push("gold");
        bracelets.push("bronze");
        System.out.println("I decided I only want to wear the silver bracelets!");
        bracelets.pop();
        bracelets.pop();
    }
}
