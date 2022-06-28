package com.java.interview.exercise.hackerrank;

public class ToMilitary {
    public static void main(String[] args) {
        String s = "12:45:54PM";
        String remain = s.substring(2, s.length()-2);
        String pm = s.substring(s.length()-2);
        int hour = Integer.parseInt(s.substring(0,2));
        int mil = 12 + hour;
        if(pm.equalsIgnoreCase("AM")){
            if(mil > 23){
                s = "00" + remain;
            }else {
                s = s.substring(0,2) + remain;
            }

        } if(pm.equalsIgnoreCase("PM")){
            if(mil > 23){
                s = s.substring(0,2) + remain;
            } else{
                s = mil + remain;
            }

        }
        System.out.println(s);
    }
}
