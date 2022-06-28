package com.java.interview.exercise.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class LargestSubStringMine {
    public static void main(String[] args) {
        System.out.println(getSubstring("emewedsh"));
    }

    private static boolean getSubstring(String str) {
        String largestSubString = null;
        int sizeOfSubstring = 0;
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!charMap.containsKey(ch)){
                charMap.put(ch, i);
            }
            else {
                i = charMap.get(str.charAt(i));
                charMap.clear();
            }
            if(charMap.size() > sizeOfSubstring){
                largestSubString = charMap.keySet().toString();
                sizeOfSubstring = charMap.size();
            }
        }
        System.out.println(largestSubString + "   " + sizeOfSubstring);
        return false;
    }
}
