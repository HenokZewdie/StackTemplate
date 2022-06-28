package com.java.interview.exercise.hackerrank;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateRatio {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,0,4,-3,-9);
        List<Double> arrDouble = new ArrayList<>();
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;
        for (Integer i: arr){
            if(i>0){
                positive++;
            }else  if(i<0){
                negative++;
            }else{
                zero++;
            }
        }
        arrDouble.add(positive);
        arrDouble.add(negative);
        arrDouble.add(zero);
        int size = arr.size();

        for (int i = 0; i < 3; i++) {
            double div = arrDouble.get(i) / size;
            NumberFormat formatter = new DecimalFormat("#0.000000");
            System.out.println(formatter.format(div));
        }

    }
}
