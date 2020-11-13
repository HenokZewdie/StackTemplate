package com.java.interview.exercise.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSortByValueField {
    public static void main(String[] args) {
        Person  person = new Person("Henok", "Zewdie", 55);
        Person  personE = new Person("Emewedsh", "Ashenafi", 22);
        Person  personM = new Person("Mena", "Henok", 6);
        Person  personEli = new Person("Eliana", "Henok", 4);
        LinkedHashMap<Integer, Person> sortedMap = new LinkedHashMap<>();
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, person);
        map.put(2, personE);
        map.put(3, personM);
        map.put(4, personEli);

       /* map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(map))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));*/
    }
}
