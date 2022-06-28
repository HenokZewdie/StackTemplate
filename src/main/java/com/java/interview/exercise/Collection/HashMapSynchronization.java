package com.java.interview.exercise.Collection;

import java.util.*;

public class HashMapSynchronization {
    public static void main(String[] args) {
        // create map
        Map<String,String> map = new HashMap<String,String>();
        
        // populate the map
        map.put("1","ALIVE ");
        map.put("2","IS");
        map.put("3","AWESOME");
        
        // create a synchronized map
        Map<String,String> syncMap = Collections.synchronizedMap(map);
        map.forEach((k,v)-> System.out.println(k + "  " + v));
        System.out.println("Synchronized map :"+syncMap);
    }
}
