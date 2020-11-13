package com.java.interview.exercise.Collection;

import java.util.*;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        List<Integer> x = Arrays.asList(22,4,32,0,22,15);
        List<int[]> test = Arrays.asList(num);
        Collections.reverse(test);
        Collections.sort(x);
        System.out.println(Arrays.asList(num).toArray());
    }
}
