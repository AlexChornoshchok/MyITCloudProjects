package com.ua.LabWork2.LabWork27.brainacad.oop.testshapes;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "thi is Shape, color is " + color;
    }
}
