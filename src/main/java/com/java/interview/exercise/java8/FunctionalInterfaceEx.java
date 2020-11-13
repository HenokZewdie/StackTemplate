package com.java.interview.exercise.java8;

@FunctionalInterface
public interface FunctionalInterfaceEx {
    static int add(int x, int y) {
        return x+y;
    }

    int calculate(int x);

}
