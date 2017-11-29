package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public class Shape implements Drawable {
    public String color;

    public Shape() {
        this("");
    }

    public Shape(String color) {this.color = color;}

    public String getColor() {return color;}

    public double calculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "thi is Shape, color is " + color;
    }

    @Override
    public void draw() {
        System.out.printf("color is %s", color);
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    /*public static Shape parseShape(String str) {
        Shape newShape = new Shape();
        String[] arrayStr = str.split(":|,");
        switch (arrayStr[0].toLowerCase()) {
            case "circle":
                newShape = new Circle(arrayStr[1], Double.parseDouble(arrayStr[2]));
                break;
            case "triangle":
                newShape = new TriangleSecond(arrayStr[1], Double.parseDouble(arrayStr[2]), Double.parseDouble(arrayStr[3]), Double.parseDouble(arrayStr[4]));
                break;
            case "rectangle":
                newShape = new Rectangle(arrayStr[1], Double.parseDouble(arrayStr[2]), Double.parseDouble(arrayStr[3]));
                break;
        }
        return newShape;
    }*/

    public static Shape parseShape(String str) {
        String[] arrayStr = str.split(":|,");
        switch (arrayStr[0].toLowerCase()) {
            case "circle":
                return Circle.parseCircle(str);
            case "triangle":
                return TriangleSecond.parseTriang(str);
            case "rectangle":
                return Rectangle.parseRectangle(str);
            default: return new Shape();
        }
    }
}
