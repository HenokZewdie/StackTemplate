package com.java.interview.exercise.random;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str = "RADAR";
        String reverse = reverse(str);
        System.out.println(reverse);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        if (builder.toString().equalsIgnoreCase(str)) {
            System.out.println("Palindrome");
            return;
        }
        System.out.println("Not Palindrome");
    }

    private static String reverse(String str) {
        char[] charString = new char[str.length()];
        char[] temp = charString;
        charString = str.toCharArray();
        int j = 0;
        for (int i = charString.length - 1; i >= 0; i--) {
            temp[j] = charString[i];
            j++;
        }
        return String.copyValueOf(temp);
    }
}
