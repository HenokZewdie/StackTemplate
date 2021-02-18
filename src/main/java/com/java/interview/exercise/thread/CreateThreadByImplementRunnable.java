package com.java.interview.exercise.thread;

public class CreateThreadByImplementRunnable implements Runnable {
        @Override
        public void run() {

            // implement run method here
        }

        public static void main() {
            final CreateThreadByImplementRunnable obj = new CreateThreadByImplementRunnable();
            Thread t1 = new Thread(new CreateThreadByImplementRunnable());
            t1.start();
        }
}
