package com.java.interview.exercise.datastructure;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackTemplate<T> {
    int index;
    T[] number;

    public StackTemplate() {
        index = 0;
        number = (T[]) new Object[10];
    }

    public static void main(String[] args) {
        StackTemplate<Integer> stackTemplate = new StackTemplate<>();
        System.out.println(stackTemplate.push(21));
        System.out.println(stackTemplate.push(31));
        System.out.println(stackTemplate.peek());
        System.out.println(stackTemplate.pop());
        System.out.println(stackTemplate.peek());
    }

    //add into the array and return in the number... spec
    public T push(T num) {
        number[index++] = num;
        return num;
    }

    public T peek() { //get from top of the stack LIFO
        return index == 0 ? null : number[index - 1];
    }

    //remove the last value from the array and return it
    public T pop() {
        if (index == 0)
            throw new EmptyStackException();
        T temp = number[--index];
        number[index] = null;
        return temp;
        //alternative  return number[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    public boolean contains(T num) {
        for (int i = 0; i < index; i++) {
            if (num.equals(number[i])) {
                return true;
            }
        }
        return false;
    }
}
