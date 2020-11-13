package com.java.interview.exercise.exception;

public class ErrorException {
    public static void test(int i) {
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }

    public static void finalMethodParameter(final int i) {
        if (i == 0)
            return;
        else {

        }
    }

}
