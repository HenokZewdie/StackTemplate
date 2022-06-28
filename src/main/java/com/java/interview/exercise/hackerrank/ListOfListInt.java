package com.java.interview.exercise.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ListOfListInt {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> names1 = new ArrayList<>();
        names1.add(2);
        names1.add(20);
        names1.add(50);

        List<Integer> names2 = new ArrayList<>();
        names2.add(121);
        names2.add(21);
        names2.add(51);

        List<Integer> names3 = new ArrayList<>();
        names3.add(122);
        names3.add(22);
        names3.add(52);

        listOfList.add(names1);
        listOfList.add(names2);
        listOfList.add(names3);

        getResult(listOfList);
    }

    private static void getResult(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftToRight+=arr.get(i).get(i);
            rightToLeft+=arr.get(i).get(arr.size()-i-1);
        }
        System.out.println(leftToRight);
        System.out.println(rightToLeft);
        System.out.println(Math.abs(leftToRight - rightToLeft));
    }
}
