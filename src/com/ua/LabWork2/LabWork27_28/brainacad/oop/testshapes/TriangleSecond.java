package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

public class TriangleSecond extends Shape implements Comparable {
    double a, b, c;

    public TriangleSecond(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double bigSide = 0;
        double sumSmallSide = 0;
        if (bigSide < a) {
            bigSide = a;
            sumSmallSide = b + c;
        }
        if (bigSide < b) {
            bigSide = b;
            sumSmallSide = a + c;
        }
        if (bigSide < c) {
            bigSide = c;
            sumSmallSide = b + a;
        }

        if (sumSmallSide < bigSide){
            return 0;
        }else if (sumSmallSide < bigSide){
            return 0;
        }else{
            double s = (a+b+c)*0.5f;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }

    @Override
    public String toString() {
        return "This is Triangle, color " +super.getColor()+
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public void draw() {
        System.out.print("This is Triangle, ");
        super.draw();
        System.out.printf(", a= %s, b= %s, c= %s, area= %s%n", a, b, c, this.calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape triangle = (Shape) o;
        return (super.getColor().compareTo(triangle.getColor()));
    }
}
