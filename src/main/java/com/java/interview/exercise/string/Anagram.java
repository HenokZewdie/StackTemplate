package com.java.interview.exercise.string;

import com.java.interview.exercise.java8.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    //Anagram LISTEN = SILENT or ABC = BCA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(getCall().getLname());

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map12 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map1.merge(str1.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < str2.length(); i++) {
            map12.merge(str2.charAt(i), 1, Integer::sum);
        }
        if (map1.equals(map12)) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT");
        }
        scanner.close();
    }

    private static Person getCall() {
        Person person = new Person();
        String test;
        try {
            person.setLname("Mena");
             test = "TEST";
            return person;
        } catch (Exception e) {
        } finally {
            person.setLname("Eliana");
            System.out.println(person.getLname());
            System.out.println("GETTTT");
            test = "NEW TEST";
        }
        return person;
    }
}
