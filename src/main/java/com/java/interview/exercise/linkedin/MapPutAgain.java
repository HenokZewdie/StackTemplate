package com.java.interview.exercise.linkedin;

import java.util.HashMap;
import java.util.Map;

public class MapPutAgain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Orange", 2);
        int newApple = map.get("Apple");
        map.put("Apple", newApple + 4);
        System.out.println(map.get("Apple"));
    }
}
