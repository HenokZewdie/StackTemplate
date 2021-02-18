package com.java.interview.exercise.linkedin;

public class StaticClassVar {
    static int var = 0;

    public static void main(String[] args) {
        if(var<3){
            var++;
            main(null);
        }else {
            return;
        }
        System.out.println("Hello");
    }
}
