package com.java.interview.exercise.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareDistinctNumber<max> {
    public static int max = 0;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,465,65,6,6,3);
        List<Integer> res = list.stream()
                .map(num -> num*num)
                .distinct()
                .collect(Collectors.toList());
        List<Integer> number = list.stream().map(SquareDistinctNumber::getMax).collect(Collectors.toList());
        IntSummaryStatistics summary = list.stream().mapToInt(nun -> nun).summaryStatistics();
        int min = getMin(list);
        System.out.println(summary);
        System.out.println(res);
        System.out.println(max);
        getDates();
    }

    private static String getMiln(List<Integer> list) {
        String test = null;
        try {
            test = "Test";
            return  test;
        }catch (Exception e){

        }finally {
            test = "AAAAA";
            System.out.println(test);
        }
        return test;
    }

    private static int getMin(List<Integer> list) {
        String test = null;
        try {
             test = "Test";
            return  list.stream().mapToInt(nun -> nun).summaryStatistics().getMin();
        }catch (Exception e){

        }finally {
            test = "AAAAA";
            System.out.println(test);
        }
     return 0;
    }

    private static void getDates() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println(today.plus(1, ChronoUnit.MONTHS));
        System.out.println(today.plus(1, ChronoUnit.DAYS));
        System.out.println(today.plus(1, ChronoUnit.YEARS));
    }

    private static int getMax(Integer num) {
        if(max<num)
         max=num;
        return num;
    }

}
