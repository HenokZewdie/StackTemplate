package com.java.interview.exercise.datastructure;

public class StackTemplate {
    int index = 0;
    int[] number = new int[10];

    public static void main(String[] args) {
        StackTemplate stackTemplate = new StackTemplate();
        System.out.println(stackTemplate.push(21));
        System.out.println(stackTemplate.push(31));
        System.out.println(stackTemplate.peek());
        System.out.println(stackTemplate.pop());
    }

    //add into the array and return in th number... spec
    public int push(int num) {
        number[index++] = num;
        return num;
    }

    public int peek() {
        return index == 0 ? 0 : number[index - 1];
    }

    //remove the last value from the array and return it
    public int pop() {
        int temp = number[index -1];
        number[index] = 0;
        return temp;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

}
