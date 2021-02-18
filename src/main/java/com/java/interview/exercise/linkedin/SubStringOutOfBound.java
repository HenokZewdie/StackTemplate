package com.java.interview.exercise.linkedin;

public class SubStringOutOfBound {
    public static void main(String[] args) {
        String msg = "Hello World!";
        String newMsg = msg.substring(6,12)+ msg.substring(12,6);
        System.out.println(newMsg);
    }
}
