package com.java.interview.exercise.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdateRegEx {
    public static void main(String[] args) throws ParseException {
        String dateString = "1985-12-12";
        String regex = "([0-9]{4})-([0-9]{2})-([0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);
        boolean bool = matcher.matches();
        if(bool) {
            System.out.println("Date is valid");
            LocalDate dob = LocalDate.parse(dateString);
            int age = calculateAge(dob);
            System.out.println(age);
            boolean valid = validateAge(age);
        } else {
            System.out.println("Date is not valid");
        }

    }

    private static boolean validateAge(int age) {
        if(age > 18 && age < 100){
            return true;
        }
        return false;
    }

    public static int calculateAge(LocalDate dob)
    {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null))
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}
