package com.java.interview.exercise.java8;

public class Person {

    private String name;
    private String lname;
    private int age;

    public Person(String name, String lname, int age) {
        this.name = name;
        this.lname = lname;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
