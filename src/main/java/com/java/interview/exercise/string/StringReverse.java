package com.java.interview.exercise.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        String output = rev(str);
        System.out.println(output);
        scanner.close();
    }

/*    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        int len = s.length();
        char A = s.charAt(len - 1);
        String sub = s.substring(0, s.length() - 1);
        String test = reverse(sub);
        String res = A + test;
        return res;
    }*/

    public static String rev(String str) {
		char[] chars = new char[str.length()];
		int j = 0;
		for (int i=str.length()-1; i>=0; i--){
			chars[j] = str.charAt(i);
			j++;
		}

        return String.copyValueOf(chars);
    }


}
