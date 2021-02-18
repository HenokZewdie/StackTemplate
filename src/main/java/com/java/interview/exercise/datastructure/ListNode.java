package com.java.interview.exercise.datastructure;

public class ListNode<T> {

    // [Tail] 12->199->1->1->27->2 [Head]
    // [Tail] 12<-199<-1<-1<-27<-2 [Head]

    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int num) {
        Node addNewNode = new Node(num);
        if (head == null) { // for the first time
            head = addNewNode;
            tail = addNewNode;
        } else {
            head.next = addNewNode;
            addNewNode.previous = head;
            head = addNewNode; //jumps to the next node
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        int counter = -1;
        Node traverse = tail;
        int response = 0;
        while (traverse != null) { //NEED TO BE UPDATED
            counter++;
            if (index == counter) {
                return traverse.value;
            }
            traverse = traverse.next;
        }
        return response;
    }

    public void remove(int num) throws IllegalAccessException {
        if (size == 0) throw new IllegalAccessException(); //better exception
        Node tempTail = tail;
        while (tempTail != null) {
            if (tempTail.value == num) {
                helpMeToRemove(tempTail);
            }
            tempTail = tempTail.next;
        }
    }

    public String removeByIndex(int index){
        if (index >= size) throw new IndexOutOfBoundsException();
        int counter = -1;
        Node traverse = tail;
        while (index != ++counter) {
            traverse = traverse.next;
        }

        helpMeToRemove(traverse);
        return toString();
    }

    public void helpMeToRemove(Node traverse){
        Node nextNodeWhenTraverse = traverse.next;
        Node previousNodeWhenTraverse = traverse.previous;

        if (previousNodeWhenTraverse == null) { //If the element is on the firstNode
            tail = nextNodeWhenTraverse;
            nextNodeWhenTraverse.previous = null;
            traverse.next = null;
        } else {
            previousNodeWhenTraverse.next = nextNodeWhenTraverse;
        }

        if (nextNodeWhenTraverse != null) {
            nextNodeWhenTraverse.previous = previousNodeWhenTraverse;
        } else { //If the element is ont he lastNode
            head = previousNodeWhenTraverse;
            traverse.previous = null;
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        Node traverse = tail;
        StringBuilder numbers = new StringBuilder("[");
        while (traverse != null) {
            numbers.append(traverse.value).append(", ");
            traverse = traverse.next;
        }
        return numbers.append("]").toString();
    }

    class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node() {
        }
    }
}

class Test {
    public static void main(String[] args) throws IllegalAccessException {
        ListNode<Integer> ln = new ListNode();
        ln.add(12);
        ln.add(199);
        ln.add(1);
        ln.add(1);
        ln.add(27);
        ln.add(2);
        System.out.println(ln.isEmpty());
        System.out.println(ln.size());
        //ln.remove(1);
        System.out.println(ln.size());
        System.out.println(ln);
        System.out.println(ln.get(4));
        System.out.println(ln.removeByIndex(4));


    }
}
