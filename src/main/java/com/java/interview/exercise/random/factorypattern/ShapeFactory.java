package com.java.interview.exercise.random.factorypattern;

public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape==null){
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }
        if ("Rectangle".equalsIgnoreCase(shape)){
            return new Rectangle();
        }
        if ("Triangle".equalsIgnoreCase(shape)){
            return new Triangle();
        }
        return null;
    }
}
