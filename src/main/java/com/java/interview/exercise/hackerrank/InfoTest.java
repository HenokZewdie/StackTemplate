package com.java.interview.exercise.hackerrank;

/*
*Given two arrays which consists of the prices for different types of bat and ball,
write a program to find the most expensive combination  possible in  a given budget .
* Bat Price Array : [20,25,30]
Ball Price Array: [ 2,4,6]
Budget :30
* 513543533
Expect Output : 29
* */

public class InfoTest {
    public static void main(String[] args) {
        int[] bat = {20,25,30, 24};
        int [] ball ={2,4,2};
        int budget = 30;
        int exp = 0;
        for (int i = bat.length -1; i > 0; i--) {
            for (int j = ball.length -1; j > 0; j--) {
                int sum = bat[i] + ball[j];
                if(sum <= budget && sum > exp){
                    exp = sum;
                }
            }
        }
        System.out.println(exp);
    }
}
