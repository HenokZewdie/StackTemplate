package com.java.interview.exercise.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCollection {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(1, "b");
		map.put(1, "x");
		map.put(1, "f");
		map.put(null, "c");
		map.put(null, null);
		map.put(null, "k");
		map.put(null, null);
		System.out.println(map);
		for(Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		Map<Integer, String> mapTable = new Hashtable<>();
		mapTable.put(1, "a");
		mapTable.put(1, "b");
		mapTable.put(1, "x");
		mapTable.put(1, "f");
/*		mapTable.put(null, "c"); 
		mapTable.put(5, null); null key and value are not allowed */

		System.out.println(mapTable.toString());
		
	}
}
