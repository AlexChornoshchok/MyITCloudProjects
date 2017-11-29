package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

import java.util.Objects;

public class Rectangle extends Shape implements Comparable {
    private double wigth;
    private double height;

    public Rectangle(String color, double wigth, double height) {
        super(color);
        this.height = height;
        this.wigth = wigth;
    }

    @Override
    public double calculateArea() {
        return (height * wigth);
    }

    @Override
    public String toString() {
        return "This is Rectangle, color " +super.getColor()+
                ", wigth= " + wigth +
                ", height= " + height;
    }

    @Override
    public void draw() {
        System.out.print("This is Rectangle, ");
        super.draw();
        System.out.printf(", wigth= %s, height= %s, area= %s%n", wigth, height, this.calculateArea());
    }

//    @Override
//    public int compareTo(Object o) {
//        Rectangle rectangle = (Rectangle) o;
//        if (this.calculateArea() < rectangle.calculateArea()) return -1;
//        if (this.calculateArea() > rectangle.calculateArea()) return 1;
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        Shape rectangle = (Shape) o;
        return (super.getColor().compareTo(rectangle.getColor()));
    }

    public static com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.Rectangle parseRectangle(String str) {
        String[] arrayStr = str.split(":|,");
        if (Objects.equals(arrayStr[0].toLowerCase(), "rectangle")) {
            return new Rectangle(arrayStr[1], Double.parseDouble(arrayStr[2]), Double.parseDouble(arrayStr[3]));
        } else return new Rectangle("", 0, 0);
    }
}
