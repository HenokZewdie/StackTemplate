package com.java.interview.exercise.hackerrank;

import java.util.Arrays;
import java.util.List;

public class AddListOfElementsLong {
    public static void main(String[] args) {
        List<Long> num = Arrays.asList(1234444L, 987654567L, 12L);
        Long total = 0L;
        for (Long l: num){
            total+=l;
        }
        System.out.println(total);
    }
}
