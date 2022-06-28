package com.java.interview.exercise.MSXInternational;

import java.util.HashMap;
import java.util.Map;

public class ClosedPath {
    public static void main(String[] args) {
        int num = 956840818; //The number which has circle or zero
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(6,1);
        map.put(8,2); // Eight has 2 circles
        map.put(9,1);
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if(null != map.get(num%10)){
                counter+=map.get(num%10);
            }
            num = num/10;
        }
        System.out.println(counter);
    }
}
