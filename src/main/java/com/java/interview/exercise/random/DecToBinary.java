package com.java.interview.exercise.random;

import java.util.Arrays;

public class DecToBinary {
    public static void main(String[] args) {
        int num = 20;
        int[] remain = new int[num];
        int j = 0;
        while(num!=0) {
            remain[j] = num%2;
            num = num / 2;
            j++;
        }
        for (int i = remain.length-1; i >= 0; i--) {
            System.out.print(remain[i]);
        }
    }
}
