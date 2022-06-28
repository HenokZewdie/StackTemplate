package com.java.interview.exercise.MSXInternational;

import java.util.*;

public class CountingPairs {

    public static void print(List<Integer> num, int k){
        Collections.sort(num);
        for (int i = 0; i < num.size()-1; i++) {
            if(num.get(i)==num.get(i+1)){
                num.remove(i);
            }
        }
        for (int i = 0; i < num.size(); i++) {
            for (int j = 1; j < num.size(); j++) {

            }
        }
    }
    public static void main(String[] args) {
        int k = 1;
        int[] num = {2,3,4,5,6,2};
        int count = 0;
        Set<Integer> setNum = new HashSet<>();
        for (int value : num) {
            setNum.add(value);
        }
        int[] numCopy = new int[setNum.size()];
        int x = 0;
        for (int n : setNum) {
            numCopy[x++] = n;
        }

        for (int i = 0; i < numCopy.length; i++) {
            for (int j = i + 1; j < numCopy.length; j++) {
                if (numCopy[i] + k == numCopy[j]) {
                    count++;
                }
            }
        }
        List<Integer> list = Arrays.asList(2,3,4,5,6,2);
       // print(list, k);
        System.out.println(count);
    }
}
