package com.java.interview.exercise.hackerrank;

import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
        Collections.sort(arr);
        long common = 0;
        int size = arr.size();
        for (int i = 1; i <= size-2; i++) {
            common+= arr.get(i);
        }
        System.out.println((arr.get(0) + common) + " " + (arr.get(size-1) + common));
    }
}
