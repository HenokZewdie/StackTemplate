package com.java.interview.exercise.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfList {

    public static void main(String args[]) {
        List<PersonData> listPerson = Arrays.asList(
                new PersonData("Henok", "Zewdie", 33,  Arrays.asList(21,21,21,21)),
                new PersonData("Ermias", "Zewdie", 36,  Arrays.asList(21,21,21,21)),
                new PersonData("Tizita", "Zewdie", 38,  Arrays.asList(21,21,21,21)));

        List<PersonData> listPerson1 = Arrays.asList(
                new PersonData("Mena", "Henok", 5,  Arrays.asList(21,21,21,21)),
                new PersonData("Eliana", "Henok", 3,  Arrays.asList(21,21,21,21)));

        List<PersonData> listPerson2 = Arrays.asList(
                new PersonData("Hawi", "Fikre", 9,  Arrays.asList(21,21,21,21)),
                new PersonData("Meti", "Fikre", 32,  Arrays.asList(21,21,21,21)),
                new PersonData("Zewdie", "Wordoffa", 83,  Arrays.asList(21,21,21,21)));

        List<List<PersonData>> listOfPersonData = new ArrayList<>();
        listOfPersonData.add(listPerson);
        listOfPersonData.add(listPerson1);
        listOfPersonData.add(listPerson2);

        List<String> res = listOfPersonData.stream()
                .flatMap(List::stream)
                .filter(c->c.getAge()>35)
                .map(PersonData::getFirstName)
                .collect(Collectors.toList());

        listOfPersonData.stream()
                .flatMap(List::stream)
                .flatMap(a->a.getPhones().stream());
        System.out.println(res);

        listOfPersonData.stream()
                .map(a->a.stream()
                        .filter(d->d.getAge()>30)
                        .filter(f->f.getFirstName().startsWith("E")).collect(Collectors.toList())

                ).collect(Collectors.toList());


        List<List<String>> listOfList = new ArrayList<>();
        List<String> names1 = new ArrayList<String>();
        names1.add("Mena ");
        names1.add("Eliana ");
        names1.add("Loza ");
        names1.add("Beti ");
        names1.add("Redi ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Meti ");
        names2.add("Hawi ");
        names2.add("Nati ");

        List<String> names3 = new ArrayList<String>();
        names3.add("Amru ");
        names3.add("Benny ");
        names3.add("Amenu ");
        names3.add("Ruth ");

        listOfList.add(names1);
        listOfList.add(names2);
        listOfList.add(names3);

        List<String> test = listOfList.stream()
                .flatMap(Collection::stream)
                .filter(c -> c.startsWith("M")).collect(Collectors.toList());

        System.out.println(test);
        ListOfList tester = new ListOfList();
        System.out.println("Sort using Java 7 syntax: ");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);
        Map<String, List<PersonData>> map = new HashMap<>();
        listOfPersonData.stream()
                .flatMap(List::stream)
                //peek(a -> mapName(a, map));
                .forEach(a -> findSiblingsByTheirLastName(a, map));

        Map<String, List<PersonData>> collect = listOfPersonData.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(PersonData::getLastName));
    }

    private static void findSiblingsByTheirLastName(PersonData a, Map<String, List<PersonData>> map) {
        /*List<PersonData> pda;
        if(map.containsKey(a.getLastName())){
            pda = map.get(a.getLastName());
            pda.add(a);
        }else
        {
            pda = new ArrayList<>();
            pda.add(a);
        }
        map.put(a.getLastName(), pda);*/

        List<PersonData> list = map.getOrDefault(a.getLastName(), new ArrayList<>());
        //map.merge(a.getLastName(), a, );
        list.add(a);
        map.put(a.getLastName(), list);
    }


    //sort using java 7
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}