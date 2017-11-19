package com.ua.LabWork2.LabWork27.brainacad.oop.testshapes;

import java.lang.Math;

public class Circle extends Shape {
    protected final static float PI = 3.14f;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return (PI * radius*radius);
    }

    @Override
    public String toString() {
        return "This is Circle, color " + super.getColor()+
                ", radius= " + radius;
    }
}
