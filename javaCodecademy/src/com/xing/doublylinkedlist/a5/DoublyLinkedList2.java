package com.xing.doublylinkedlist.a5;

import com.xing.doublylinkedlist.a6.Node;

public class DoublyLinkedList2 {

    public com.xing.doublylinkedlist.a6.Node head;
    public com.xing.doublylinkedlist.a6.Node tail;

    public DoublyLinkedList2() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        com.xing.doublylinkedlist.a6.Node newHead = new com.xing.doublylinkedlist.a6.Node(data);
        com.xing.doublylinkedlist.a6.Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        com.xing.doublylinkedlist.a6.Node newTail = new com.xing.doublylinkedlist.a6.Node(data);
        com.xing.doublylinkedlist.a6.Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }
        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        com.xing.doublylinkedlist.a6.Node removedHead = this.head;

        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();

        if (removedHead != null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.tail) {
            this.removeTail();
        }
        return removedHead.data;
    }

    public String removeTail() {
        com.xing.doublylinkedlist.a6.Node removedTail = this.tail;

        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();

        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data;
    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while(currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {

    }
}
