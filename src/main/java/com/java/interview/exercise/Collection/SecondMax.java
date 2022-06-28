package com.java.interview.exercise.Collection;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        //int[] num = {23,3,4,44,0,-2,32,9,98,4,422,-93,45,98};
        int[] num = {10,60,50,90,170,110,130,90,43};
        //Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        int max = num[0], secondMax = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>secondMax && num[i] < max){
                secondMax=num[i];
            }
            if(num[i]>max){
                secondMax = max;
                max = num[i];
            }
        }
        System.out.println(secondMax);
    }
}
