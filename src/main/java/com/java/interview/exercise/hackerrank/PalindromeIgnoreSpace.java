package com.java.interview.exercise.hackerrank;

public class PalindromeIgnoreSpace {
    //race car
    public static void main(String[] args) {
        String st = "abba";
        st = st.replace(" ", "");
        reverse(st);
        StringBuilder sb = new StringBuilder(st);
        String rev = sb.reverse().toString().trim();
        //System.out.println(st.equalsIgnoreCase(rev));
    }

    private static void reverse(String st) {
        int size = st.length();
        String response = "Palindrome";
        for (int i = 0; i < (size/2) + 1; i++) {
            if(st.charAt(i) == st.charAt(size-1-i)){
            }else
            {
                response = "Not";
            }
        }
        System.out.println(response);
    }
}
