package com.java.interview.exercise.random;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int next = 0;
        int n1 = 1;
        int n2 = 0;
        for (int i = 1; i <= counter; i++) {
            if (i == 1 || i == 2) {
                System.out.println(1);
                next = 2;
            } else {
                System.out.println(next);
                n2=n1;
                n1 = next;
                next = n1+n2;
            }

        }
    }
}
