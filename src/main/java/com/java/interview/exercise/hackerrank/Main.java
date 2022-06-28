package com.java.interview.exercise.hackerrank;

import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] intArray = {3,0,1,0,0,5};
        int[] resultArray = new int[intArray.length];
        int valueToCheck = 0;
        int y = 0;

        //Add zeros at the begining of output array
        for (int x = 0; x < intArray.length; x++){
            if (intArray[x] == valueToCheck){
                resultArray[y] = intArray[x];
                y++;
            }
        }
//Add non zeros on the output array after the zeros
        for (int z = 0; z < intArray.length; z++){
            if (intArray[z] != valueToCheck){
                resultArray[y] = intArray[z];
                y++;
            }
        }
//log input array
        String[] strArray = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        //before java 8
        // String[] strArray = new String[intArray.length];
        //     for(int j = 0; j < intArray.length; j++){
        //         strArray[j] = string.valueof(intArray[j])
        //     }
        System.out.println("Input Array :::::::" + Arrays.toString(strArray));
        //log output array
        String[] resutStrArray = Arrays.stream(resultArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);


        System.out.println("Output Array :::::::" + Arrays.toString(resutStrArray));
    }
    //if array contains valueToCheck return true else false
    public static boolean checkIntArrayValue(int[] intArray, int valueToCheck){
        for (int array : intArray){
            if(array == valueToCheck)
                return true;
        }
        return false;
    }
}
