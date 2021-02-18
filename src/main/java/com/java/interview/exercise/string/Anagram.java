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

        isAnagram(str1, str2);
    }

    public static void isAnagram(String str1, String str2) {
        System.out.println(getCall());

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
    }

      public static String getCall() {
        Person person = new Person();
        try {
            person.setLname("Mena");
            return person.getLname();
        } catch (Exception ignored) {
        } finally {
            person.setLname("Eliana");
            System.out.println("finally block " + person.getLname());
        }
        return person.getLname();
    }
}
