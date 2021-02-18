package com.java.interview.exercise.random;

public class Prime {
    public static void main(String[] args) {
        int num = 15;
        int counter=1;
        for (int i = 2; i<num/2; i++){
            if (num%i==0){
                counter++;
                if (counter>2){
                    System.out.println("Not Prime");
                    return;
                }
            }
        }
        System.out.println("Prime");
    }
}
