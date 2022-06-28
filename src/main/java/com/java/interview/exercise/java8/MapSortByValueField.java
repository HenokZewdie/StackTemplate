package com.java.interview.exercise.java8;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortByValueField {
    public static void main(String[] args) {
        Person  person = new Person("Henok", "Zewdie", 55);
        Person  personE = new Person("Emewedsh", "Ashenafi", 22);
        Person  personM = new Person("Mena", "Henok", 6);
        Person  personEli = new Person("Eliana", "Henok", 4);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(personE);
        personList.add(personM);
        personList.add(personEli);

        personList.stream().filter(a->a.getAge() > 20).forEach(x-> System.out.println(x.getName()));
        //Same lName and age is > 5
        personList.stream()
                .filter(a->a.getLname().equalsIgnoreCase("Henok") && a.getAge() > 4)
               // .filter(x->x.getAge() > 4)
                .collect(Collectors.toList())
                .forEach(s-> System.out.println(s.getName()));


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
