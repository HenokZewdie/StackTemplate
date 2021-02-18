package com.java.interview.exercise.linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameASC {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl");
        //names.sort(Comparator.comparing(String::toString));
        List<String> test = names.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(test);
    }
}
