package com.java.interview.exercise.MSXInternational.drawingshape;

public class ShapeFactory {

    public Shape drawShape(String type) {
        if (!(type.equalsIgnoreCase("Square") || type.equalsIgnoreCase("Rectangle")
                || type.equalsIgnoreCase("Circle"))) {
            System.out.println("Draw " + type + " is not supported");
        } else {
            System.out.println("Now drawing a " + type);
        }

        ShapeFactory shapeFactory = new ShapeFactory();
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
