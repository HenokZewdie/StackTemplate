package com.java.interview.exercise.hackerrank.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        Singleton s3 = Singleton.getSingletonInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
