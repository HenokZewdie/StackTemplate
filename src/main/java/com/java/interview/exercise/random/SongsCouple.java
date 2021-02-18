package com.java.interview.exercise.random;

//You can only buy 2 songs at a time and the sum of 2 songs should be a factor of 60
public class SongsCouple {
    public static void main(String[] args) {
        int[] songs = {30, 20, 90, 10, 40, 50, 30};
        int count = 0;
        for (int i = 0; i < songs.length-1; i++) {
            for (int j = i+1; j < songs.length; j++) {
                if ((songs[i] + songs[j]) % 60 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
