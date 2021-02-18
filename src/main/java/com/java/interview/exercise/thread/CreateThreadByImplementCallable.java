package com.java.interview.exercise.thread;

import java.util.concurrent.*;

public class CreateThreadByImplementCallable implements Callable {
    private static final int THREAD_POOL_SIZE = 2;

    // method where the thread execution takes place
    public String call() {
        return Thread.currentThread().getName() + " executing ...";
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        // create a pool of 2 threads
        ExecutorService executor = Executors
                .newFixedThreadPool(THREAD_POOL_SIZE);

        Future future1 = executor.submit(new CreateThreadByImplementCallable());
        Future future2 = executor.submit(new CreateThreadByImplementCallable());

        System.out.println(Thread.currentThread().getName() + " executing ...");

        //asynchronously get from the worker threads
        System.out.println(future1.get());
        System.out.println(future2.get());

    }
}
