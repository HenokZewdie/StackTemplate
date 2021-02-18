package com.java.interview.exercise.string;

public class SingletonExample {

    private static SingletonExample singletonExample = null;
    private String num;

    private SingletonExample() {

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public static SingletonExample getSingletonExample() {
        if(singletonExample==null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
}
