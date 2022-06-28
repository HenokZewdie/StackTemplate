package com.java.interview.exercise.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> unsortedValues = new LinkedHashMap<String, Integer>();
        unsortedValues.put("Z", 10);
        unsortedValues.put("B", 4);
        unsortedValues.put("A", 9);
        unsortedValues.put("C", 33);
        unsortedValues.put("D", 1);
        unsortedValues.put("E", 12);
        unsortedValues.put("Y", 3);
        unsortedValues.put("N", 3);
        unsortedValues.put("J", 9);
        unsortedValues.put("M", 44);
        unsortedValues.put("F", 15);

        Map<String, Integer> result = unsortedValues.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("result "+ result);
        Map<String, String> unsortedMap = new LinkedHashMap<String, String>();
        unsortedMap.put("Z", "z");
        unsortedMap.put("B", "b");
        unsortedMap.put("A", "a");
        unsortedMap.put("C", "c");
        unsortedMap.put("D", "d");
        unsortedMap.put("E", "e");
        unsortedMap.put("Y", "y");
        unsortedMap.put("N", "n");
        unsortedMap.put("J", "j");
        unsortedMap.put("M", "m");
        unsortedMap.put("F", "f");

        System.out.println(unsortedMap);
        Map<String, String> sorted = new TreeMap<>(unsortedMap);
        System.out.println("TREE " + sorted);
        Map<String, String> insertion = new HashMap<>(unsortedMap);
        System.out.println(insertion);
    }
}
