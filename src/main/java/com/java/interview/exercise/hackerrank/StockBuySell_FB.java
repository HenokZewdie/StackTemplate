package com.java.interview.exercise.hackerrank;

public class StockBuySell_FB {
    public static void main(String[] args) {
        int[] days = {20,3,8,4,3,10,5,19,6,9,22};
        int buyIndex = 0; // first day
        int sellIndex = 0;
        int min = days[0];
        int max = 0;
            for (int j = 0; j < days.length; j++) { // It has to buy before sell
                if (max < days[j] && j!=0){
                        max = days[j];
                        sellIndex = j;

                } if (min > days[j]){
                    min = days[j];
                    buyIndex = j;
                }
            }
        System.out.println("buy at day: " + (buyIndex + 1) + " and sell at day: " + (sellIndex+1));
    }
}
