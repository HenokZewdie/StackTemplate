package com.java.interview.exercise.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Occurances {
    public static void main(String[] args) {
       boolean res = get("aba");
        System.out.println(res);
    }

    public static boolean get(String str){
        if(str.length() == 1){
            return true;
        }
        boolean control = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' && control){
                continue;
            }
            if (str.charAt(i) =='b'){
                control = true;
            }
        }
        return control;
    }
}
