package com.java.interview.exercise.ikm;

public class ThisStaticInnerClass {

    private int test;
    public ThisStaticInnerClass() {
        this(10); //Constructor Chaining... calling the parameterized constructor
    }
    public ThisStaticInnerClass(int data) {
        this.data =data;
    }
    public void display(){
        class Decremented {
            public void decrement(){
                data--;
            }
        }
        Decremented decrement = new Decremented();
        decrement.decrement();
        System.out.println("Data: " + data);
        System.out.println("Test: " + test);
    }
    private int data;
    public static void main(String[] args) {
        int data = 0;
        ThisStaticInnerClass ts = new ThisStaticInnerClass();
        ts.display();
        System.out.println("Data: " + data);
    }
}
