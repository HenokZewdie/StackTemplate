package com.java.interview.exercise.reflection;

public class MainClass{
        // creating a private field
        private String s;

        public MainClass()  {  s = "Mena"; }

        private void method3() {
        System.out.println("Private method invoked");
    }
    public void method1()  {
        System.out.println("The string is " + s);
    }
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }
}
