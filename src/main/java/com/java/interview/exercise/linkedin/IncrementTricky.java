package com.java.interview.exercise.linkedin;

//How many times it will print Hello....10
public class IncrementTricky {
    public static void main(String[] args) {
        for (int i=0;i<10;i=i++){
            i+=1; //If we remove this, it will be an infinite loop
            System.out.println("Hello: " + i);
        }
    }
}
