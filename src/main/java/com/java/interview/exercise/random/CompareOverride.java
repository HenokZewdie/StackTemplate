package com.java.interview.exercise.random;

import java.util.Arrays;

public class CompareOverride {

    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 21;
        String str1 = "Hello";
        String str2 = "Hello";
        int[] n = {2, 3, 5, 7};
        int[] m = {2, 3, 5, 1};
        boolean intRes = compare(num1, num2);
        boolean strRes = compare(str1, str2);
        boolean booleanRes = compare(n, m);
        System.out.println(intRes);
        System.out.println(strRes);
        System.out.println(booleanRes);
    }

    private static boolean compare(int[] n, int[] m) {
        //Both the length and elements should be equal
        boolean res = false;
        if (n.length != m.length)
            return false;
        for (int i = 0; i < n.length; i++) {
            Arrays.sort(n);
            Arrays.sort(m);
            if (n[i] != m[i]) {
                break;
            }else if(i == m.length-1) {
                res = true;
            }

        }
        return res;
    }

    private static boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    private static boolean compare(int num1, int num2) {
        return num1 == num2;
    }
}
