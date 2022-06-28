package com.java.interview.exercise.hackerrank;

import java.util.Arrays;

public class MoveZerosToTheLeft {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int target = 15;
        //int arr[] = {1,6, 0, 9};
        int n = arr.length;
        //pushToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        pushZeroToFront(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void pushToEnd(int[] arr, int n) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }

    private static void pushZeroToFront(int[] arr) {
        int size = arr.length;
        for (int i = size-1; i >= 0; i--) {
            if(arr[i] != 0){
               // size-=1;
                arr[--size] = arr[i];
            }
        }
        for (int j = 0; j < size; j++) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*        List<Integer> number = Arrays.asList(1,10,20,0,59,62,0,88, 0);
        List<Integer> copy = new ArrayList<>();
        int j = 0;
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i < number.size(); i++) {
            if (flag && number.get(i)!=0) {
                copy.add(number.get(i));
            }
            if(number.get(i)==0 && !flag){
                copy.add(0);
                number.remove(i);
                j++;
            }if(i == number.size() -1){
                i = j;
                flag = true;
                counter++;
            }if(counter==2){
                break;
            }
        }
        System.out.println(copy);*/