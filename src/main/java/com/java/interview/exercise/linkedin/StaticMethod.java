package com.java.interview.exercise.linkedin;

public class StaticMethod {
    Object msg(){
        return "Hello";
    }

    public static void main(String[] args) {
        System.out.println(new StaticMethod().msg());
        System.out.println(new Main2().msg());
    }
}
class Main2 extends StaticMethod{
    String msg(){
        return "World";
    }
}
