package com.java.interview.exercise.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] candles = {2,5,6,4,4,6,2,5,3,6};
        int max = candles[0];
        int counter = 0;
        for (int i = 0; i < candles.length; i++) {
            if (candles[i] == max){
                counter++;
            }else if (candles[i] > max){
                counter = 0;
                max = candles[i];
                counter++;
            }
        }
        System.out.println(max + " " +counter);
    }
}
