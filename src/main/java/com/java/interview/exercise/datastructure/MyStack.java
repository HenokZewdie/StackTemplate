package com.java.interview.exercise.datastructure;

import java.util.EmptyStackException;

public class MyStack {

    private Node head;
    private int size = 0;

    public boolean isEmpty() {
        return null == head;
    }

    public Object push(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        return head.val;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return head.val;
    }

    public Object pop() {
        if (isEmpty())
            throw new EmptyStackException();
        Object temp = head.val;
        head = head.next;
        size--;
        return temp;
    }

    public boolean contains(Object value) {
        Node traverse = head;
        while (traverse != null) {
            if (traverse.val == value)
                return true;
            traverse = traverse.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public Object peek(int index) {
        if (index >= size) return null;
        if (index < 0) throw new IllegalArgumentException();
        Node traverse = head;
        while (index != 0) {
            traverse = traverse.next;
            index--;
        }
        return traverse.val;
    }

    class Node {
        Object val;
        Node next;

        public Node(Object val) {
            this.val = val;
        }

        public Node() {
        }
    }
}
