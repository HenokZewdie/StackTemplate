package com.java.interview.exercise.random.operatorParameter;

import java.util.HashSet;
import java.util.Set;

public class CountingAddPairs {

    public static void main(String[] args) {
        int[] num = {1,1,4,6,7,3,2,8};
        int k = 1;
        int counter = 0;
        Set<Integer> setInt = new HashSet<>();
        for (int i: num){
            setInt.add(i);
        }
        int[] newValue = new int[setInt.size()];
        int l = 0;
        for (int i: setInt){
            newValue[l] = i;
            l++;
        }
        for (int i = 0; i < newValue.length; i++) {
            for (int j = 0; j < newValue.length; j++) {
                if (newValue[i]+k==newValue[j]){
                    System.out.println("i = " + newValue[i] + " j = " + newValue[j]);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
