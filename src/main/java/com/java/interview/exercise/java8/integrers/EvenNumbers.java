package com.java.interview.exercise.java8.integrers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(17,10,15,8,49,25,98,98,15,32);
        /*myList.stream()
                .filter(a->a%2==0)
                .forEach(System.out::println);

        //Duplicate
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(as->!set.add(as)) //Not added to set values
                .forEach(System.out::println);

        //Find numbers starts by 1
        myList.stream()
                .filter(a-> a / 10 == 1)
                .forEach(System.out::println);

        myList.stream()
                .filter(a->a%2==0)
                .findFirst()
                .ifPresent(System.out::println); */
        myList.stream()
                .map(a->a%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
