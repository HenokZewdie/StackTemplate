package com.java.interview.exercise.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountFromStatement {
    public static void main(String[] args) {

        String str = "This this is is done by Saket Saket";
        String[] splitString = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<splitString.length; i++){
            map.merge(splitString[i].toLowerCase(), 1, Integer::sum);
        }
        System.out.println(map);
   /*     for (int i=0; i<splitString.length; i++) {
            if (map.containsKey(splitString[i])) {
                int count = map.get(splitString[i]);
                map.put(splitString[i], count+1);
            }
            else {
                map.put(splitString[i], 1);
            }
        }*/

    }
}
