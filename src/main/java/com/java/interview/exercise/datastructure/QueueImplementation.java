package com.java.interview.exercise.datastructure;


import java.util.Queue;

public class QueueImplementation<T> {

    // [Tail] 12->199->1->1->27->2 [Head]
    // [Tail] 12<-199<-1<-1<-27<-2 [Head]
    QueueNode head;
    QueueNode tail;
    int size = 0;

    public boolean add(T value) { //  Inserts the specified element into this queue
        QueueNode newlyAddedValue = new QueueNode(value);
        if (head == null) {
            head = newlyAddedValue;
            tail = newlyAddedValue;
        } else {
            head.next = newlyAddedValue;
            newlyAddedValue.previous = head;
            head = newlyAddedValue;
        }
        size++;
        return true;
    }

    public void remove() { //Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
        QueueNode traverse = tail;
        QueueNode nextNodeWhenTraverse = traverse.next;
        tail = nextNodeWhenTraverse;
        nextNodeWhenTraverse.previous = null;
        traverse.next = null;
        size--;
    }

    public T peek() { //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
       return tail.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    class QueueNode {
        T value;
        QueueNode next;
        QueueNode previous;

        public QueueNode(T value) {
            this.value = value;
        }

        public QueueNode() {
        }
    }

    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation();
        qi.add(12);
        qi.add(92);
        qi.add(42);
        qi.add(2);
        System.out.println(qi.peek());
        qi.remove();
        qi.add(99);
        System.out.println(qi.size);
        System.out.println(qi.peek());
    }
}
