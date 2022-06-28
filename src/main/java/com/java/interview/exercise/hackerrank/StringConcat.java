package com.java.interview.exercise.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class StringConcat {
    public static void main(String[] args) {
        String[] arr = {"co", "dil", "ity"};
        String[] arr21 = {"abc", "yyy", "def", "csv"};
        String[] arr2 = {"eva", "jqw", "tyn", "jan"};
        int res = get(arr2);
    }

    private static int get(String[] arr) {
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                String con = arr[i].concat(arr[j]);
                char[] si = con.toCharArray();
                Map<Character, Integer> map = new HashMap<>();
                for (int k = 0; k < si.length; k++) {
                    map.merge(si[k], 1, Integer::sum);
                }
                if(maxSize < map.size())
                    maxSize = map.size();
            }
        }
        System.out.println(maxSize);
        return maxSize;
    }
}
