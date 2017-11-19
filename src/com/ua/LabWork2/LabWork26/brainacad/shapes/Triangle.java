package com.ua.LabWork2.LabWork26.brainacad.shapes;

import java.lang.Math;

public class Triangle {
    float a, b, c;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(float a) {
        this(a, 1, 1);
    }

    public Triangle(float a, float b) {
        this(a, b, 1);
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getArea() {
        float bigSide = 0;
        float sumSmallSide = 0;
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
            return "TriangleSecond does not exist";
        }else if (sumSmallSide < bigSide){
            return "Area of a triangle = 0";
        }else{
            float s = (a+b+c)*0.5f;
            return "Area of a triangle = " + Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }

    }

}
