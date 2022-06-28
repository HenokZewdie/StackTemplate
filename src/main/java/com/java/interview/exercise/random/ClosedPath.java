package com.java.interview.exercise.random;

import java.util.HashMap;
import java.util.Map;

public class ClosedPath {
    public static void main(String[] args) {

        int number = 9460548;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(6,1);
        map.put(8,2);
        map.put(9,1);

        for (int i = 0; i < number; i++) {
            map.merge(number%10, map.get(number%10), Integer::sum);
            number=number/10;
        }
    }
}
