package com.java.interview.exercise.linkedin;

//How many times it will print Hello....10
public class IncrementTricky {
    public static void main(String[] args) {
        for (int i=0;i<10;i=i++){
            i+=1;
            System.out.println("Hello: " + i);
        }
    }
}
