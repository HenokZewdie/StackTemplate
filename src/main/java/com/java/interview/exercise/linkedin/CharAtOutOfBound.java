package com.java.interview.exercise.linkedin;

public class CharAtOutOfBound {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i= 0; i<str.length(); i++){
            System.out.println(str.charAt(i+1));
        }
    }
}
