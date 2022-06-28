package com.java.interview.exercise.hackerrank.singleton;

public class Singleton {

    private Singleton(){}

    private static volatile Singleton singletonInstance = null;

    public static Singleton getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Singleton();
            return singletonInstance;
        }
        return singletonInstance;
    }
}
