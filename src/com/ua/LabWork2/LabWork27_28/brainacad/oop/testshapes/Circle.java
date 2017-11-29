package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

import java.util.Objects;

public class Circle extends Shape implements Comparable {
    protected final static float PI = 3.14f;
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return (PI * radius * radius);
    }

    @Override
    public String toString() {
        return "This is Circle, color " + super.getColor() + ", radius= " + radius;
    }

    @Override
    public void draw() {
        System.out.print("This is Circle, ");
        super.draw();
        System.out.println(", radius= " + radius + ", area= " + this.calculateArea());
    }

//    @Override
//    public int compareTo(Object o) {
//        Circle circle = (Circle) o;
//        if (this.radius < circle.radius) return -1;
//        if (this.radius > circle.radius) return 1;
//        return 0;
//    }


    @Override
    public int compareTo(Object o) {
        Shape circle = (Shape) o;
        return (super.getColor().compareTo(circle.getColor()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    public static com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.Circle parseCircle(String str) {
        String[] arrayStr = str.split(":|,");
        if (Objects.equals(arrayStr[0].toLowerCase(), "circle"))
            return new Circle(arrayStr[1], Double.parseDouble(arrayStr[2]));
        else return new Circle("", 0);
    }
}

