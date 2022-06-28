package com.java.interview.exercise.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateStrings {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hen","Erm", "Mena","Mena","Eliana", "Mena");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.size(); i++) {
            map.merge(str.get(i), 1, Integer::sum);
        }
        System.out.println(map);
        int max = Collections.max(map.values());
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
