package com.java.interview.exercise.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HolesInNumbers {
    public static void main(String[] args) {
        int number = 9087624;
        int[] holes = {1, 0, 0, 0, 1, 0, 1, 0, 2, 1};
        int totalAngels = 0;
        for (int i = 0; i < number; i++) {
            totalAngels += holes[number % 10];
            number = number / 10;
            List<Integer> numbersCopy = Arrays.asList(2,5,1,0,12,4);
            Collections.sort(numbersCopy, (a,b)->a.compareTo(b));
            System.out.println(numbersCopy);
        }
        System.out.println(totalAngels);
    }

}
