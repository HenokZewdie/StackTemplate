package com.java.interview.exercise.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListTemplate {
    LinkedList<Object> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(21);
        num.add(21);
        num.add(2, 36);
        System.out.println(num);
        System.out.println(num.get(3));
        num.removeIf(a -> a.equals(21));

        System.out.println(num);
    }

    public boolean add(Object value) {
        return linkedList.add(value);
    }

    public void add(int index, Object value) {
        linkedList.add(index, value);
    }

    public Object get(int index) {
        return linkedList.get(index);
    }

    public boolean remove(Object value) {
        return linkedList.remove(value);
    }

    public Object remove(int index) {
        return linkedList.remove(index);
    }

    public Integer size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public boolean contains(Object value) {
        return linkedList.stream()
                .anyMatch(value::equals);
    }

    public boolean removeIf(Predicate<Object> predicate, Object value) {
        if (predicate.test(value)) {
            return remove(value);
        }
        return false;
    }


}

