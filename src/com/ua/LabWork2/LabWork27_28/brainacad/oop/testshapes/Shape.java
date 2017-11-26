package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

abstract public class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "thi is Shape, color is " + color;
    }

    @Override
    public void draw() {
        System.out.printf("color is %s",color);
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
