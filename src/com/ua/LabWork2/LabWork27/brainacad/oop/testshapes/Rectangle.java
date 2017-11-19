package com.ua.LabWork2.LabWork27.brainacad.oop.testshapes;

public class Rectangle extends Shape {
    private double wigth;
    private double height;

    public Rectangle(String color, double wigth, double height) {
        super(color);
        this.height = height;
        this.wigth = wigth;
    }

    @Override
    public double calculateArea() {
        return (height*wigth);
    }

    @Override
    public String toString() {
        return "This is Rectangle, color " +super.getColor()+
                ", wigth= " + wigth +
                ", height= " + height;
    }
}
