package com.java.interview.exercise.thread;

public class CreateThreadByExtendsThreadClass extends Thread {

    //method where the thread execution will start
    public void run(){
        //logic to execute in a thread
    }

    //let’s see how to start the threads
    public static void main(String[] args){
        Thread t1 = new Thread(new CreateThreadByExtendsThreadClass());
        Thread t2 = new Thread(new CreateThreadByExtendsThreadClass());
        t1.start();  //start the first thread. This calls the run() method.
        t2.start(); //this starts the 2nd thread. This calls the run() method.
    }
}
