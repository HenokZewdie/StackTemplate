package com.java.interview.exercise.linkedin;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badCode();
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }
    }

    private static void badCode() {
        throw new Error();
    }
}
