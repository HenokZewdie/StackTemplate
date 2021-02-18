package com.java.interview.exercise.random.operatorParameter;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int total = 1;
        for (int i = num; i >= 1; i--) {
            total*=i;
        }
        System.out.println(total);
    }
}
