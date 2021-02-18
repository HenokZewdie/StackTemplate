package com.java.interview.exercise.linkedin;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
        }catch (Exception e){
            System.out.println("e");
        }/*catch (ArithmeticException e){
            System.out.println("e");
        }*/finally {
            System.out.println("!");
        }
    }
}
