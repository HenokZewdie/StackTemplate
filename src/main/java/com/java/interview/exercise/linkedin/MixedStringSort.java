package com.java.interview.exercise.linkedin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MixedStringSort {
    public static void main(String[] args) {
        String[] arg = {"ab", "23", "10", "0"};
        System.out.println(arg[0].compareTo("s"));
        System.out.println(arg[0].compareTo("a"));
        List<String>str = Arrays.asList(arg);
        Collections.sort(str);
        System.out.println(str);
    }
}
