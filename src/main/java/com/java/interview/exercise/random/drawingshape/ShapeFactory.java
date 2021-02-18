package com.java.interview.exercise.random.drawingshape;

public class ShapeFactory {

    public static void main(String[] args) {
        drawShape("Oval");
    }
    public static void drawShape(String type){
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        circle.drawShape();
        square.drawShape();
        rectangle.drawShape();
        System.out.println();
        if (!(type.equals("Square")||type.equals("Rectangle")|| type.equals("Circle"))){
            System.out.println("Draw " + type + " is not supported");
        }else{
            System.out.println("Now drawing a " + type);
        }

    }
}
