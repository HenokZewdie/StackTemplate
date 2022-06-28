package com.java.interview.exercise.hackerrank;

import java.util.Arrays;
public class FindMaxByEkram
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] inputArray = {2,5,6,4,4,6,2,5,3,6,7};
        int[] outputArray = new int[2];
        long count = 0;
//find the largest number in the input array
        for(int i = 0; i <= inputArray.length-2; i++){
            if(inputArray[i] >= inputArray[i+1]){
                outputArray[0] = inputArray[i];

            }else{
                outputArray[0] = inputArray[i+1];
            }
        }
//count occurance
        count = Arrays.stream(inputArray).filter(j -> j == outputArray[0]).count();
        outputArray[1] = (int)count;
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(outputArray));
    }
}
