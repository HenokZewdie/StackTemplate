package com.java.interview.exercise.random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("/Users/henokwordoffa/IdeaProjects/StackTemplate/src/main/resources/employee.json")) {

            JSONArray a = (JSONArray) jsonParser.parse(new FileReader("/Users/henokwordoffa/IdeaProjects/StackTemplate/src/main/resources/employee.json"));

            for (Object o : a)
            {
                JSONObject person = (JSONObject) o;

                String name = (String) person.get("employee_name");
                System.out.println(name);

                String city = (String) person.get("employee_salary");
                System.out.println(city);

                String job = (String) person.get("employee_age");
                System.out.println(job);

            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        //Get employee first name
        String employee_name = (String) employeeObject.get("employee_name");
        System.out.println(employee_name);

        //Get employee last name
        String employee_salary = (String) employeeObject.get("employee_salary");
        System.out.println(employee_salary);

        //Get employee website name
        String employee_age = (String) employeeObject.get("employee_age");
        System.out.println(employee_age);
    }
}

