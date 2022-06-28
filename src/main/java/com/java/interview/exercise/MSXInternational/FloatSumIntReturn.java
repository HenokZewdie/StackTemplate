package com.java.interview.exercise.MSXInternational;

public class FloatSumIntReturn {
    public static void main(String[] args) {
        float a = 4.9f;
        float b = 7.3f;
        int result = addNumbers(a,b);
        System.out.println(result);
    }

    private static int addNumbers(float a, float b) {
        return (int) ((int) a+b);
    }
}
