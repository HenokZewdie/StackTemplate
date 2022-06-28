package com.java.interview.exercise.random.drawingshape;

public class ExternalCalleeClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.drawShape("ciRCle");
        circle.drawShape();
        Shape rectangle = shapeFactory.drawShape("rectangle");
        rectangle.drawShape();
    }
}
