package com.java.interview.exercise.Collection;

import java.util.*;

public class ArrayFindByIndex {

    public static void main(String[] args) {
        int[] num1 = {11, 21, 31, 41, 51};
        int[] num2 = {31, 51, 11, 21, 41};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num1.length; i++) {
            map.put(num2[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < num2.length; i++) {
            System.out.println("Index for " + num1[i] + " is: " + map.get(num1[i]));
        }
        String[] names = {"Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl"};
        List a = new ArrayList();
        a.add("as");
        a.add(21);
        
        List<String> test = Arrays.asList(names);
        Collections.sort(test);
        Collections.reverse(test);
        System.out.println(Arrays.toString(names));
        System.out.println(test);

        for (int i = 0; i < names.length /2; i++) {
            String temp = names[i];
            names[i] = names[names.length-1 -i];
            names[names.length-1 -i] = temp;
        }
    }
}
