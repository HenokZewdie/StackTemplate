package com.java.interview.exercise.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AliceBob {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2,3,5);
        List<Integer> b = Arrays.asList(1,3,50);
        int total_a = 0;
        int total_b = 0;
        List<Integer> res =  new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)){
               total_a++;
            }else if (a.get(i) < b.get(i)){
                total_b++;
            }
        }
        res.add(total_a);
        res.add(total_b);
        System.out.println(res);
    }
}

        /*
        Example

        a = [1, 2, 3]
        b = [3, 2, 1]
        For elements *0*, Bob is awarded a point because a[0] .
        For the equal elements a[1] and b[1], no points are earned.
        Finally, for elements 2, a[2] > b[2] so Alice receives a point.
                The return array is [1, 1] with Alice's score first and Bob's second.
        */