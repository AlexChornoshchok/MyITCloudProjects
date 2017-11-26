package com.ua.LabWork2.LabWork27_28;

import com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.Circle;
import com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.Rectangle;
import com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.Shape;
import com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.TriangleSecond;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/*      // Laboratory work 2-7-(1-5)

        Device device1 = new Device("Samsung" ,500, "JH78BGD65");
        Device device2 = new Device("Samsung" ,500, "HG5RDJ90F");
        Monitor monitor1 = new Monitor( 1280, 760);
        EthernetAdapter eAdapter1 = new EthernetAdapter( 100, "kjsghj68kjasdj4");

        System.out.println("Device: "+device1);
        System.out.println(monitor1);
        System.out.println(eAdapter1);

        Device[] device = new Device[3];
        device[0] = new Device("Samsung" ,500, "JH78BGD65");
        device[1] = new Monitor(1280, 760);
        device[2] = new EthernetAdapter(100, "kjsghj68kjasdj4");

        for (Device element: device1) {
            System.out.println(element);
        }
*/

        // Laboratory work 2_7_(6-9)

//        Shape shape1 = new Shape("White");
//        System.out.println(shape1);
//        System.out.println("Shape area is " + shape1.calculateArea());

/*
        Circle circle1 = new Circle("Blue", 0.8);
        System.out.println(circle1);
        System.out.println("\"Shape area is \"" + circle1.calculateArea());

        Rectangle rectangle1 = new Rectangle("Green", 1.2, 4.56);
        System.out.println(rectangle1);
        System.out.println("Shape area is " + rectangle1.calculateArea());

        TriangleSecond triangle1 = new TriangleSecond("Red", 2.3, 4, 1.9);
        System.out.println(triangle1);
        System.out.println("Shape area is " + triangle1.calculateArea());
*/

        // Laboratory work 2_7_10 , 2_8_3
        Shape[] arrayShape = new Shape[9];
        arrayShape[0] = new Rectangle("White", 5.6, 2.3);
        arrayShape[1] = new Rectangle("Red", 1.2, 3);
        arrayShape[2] = new Rectangle("Blue", 4, 3.2);
        arrayShape[3] = new Rectangle("Black", 0.2, 6.9);
        arrayShape[4] = new Rectangle("Yellow", 6.7, 10);
        arrayShape[5] = new Circle("Green", 0.7);
        arrayShape[6] = new Circle("Gray", 1.2);
        arrayShape[7] = new TriangleSecond("Violet", 3, 4, 6);
        arrayShape[8] = new TriangleSecond("Pink", 11, 3, 9);

//        double sumAreaRectangle = 0;
//        double sumAreaCircle = 0;
//        double sumAreaTriangle = 0;
//        Arrays.sort(arrayShape);
//        for (Shape element : arrayShape) {
//            element.draw();
//            System.out.println(element);
//            if (element instanceof Rectangle) {
//                sumAreaRectangle += element.calculateArea();
//            } else if (element instanceof Circle) {
//                sumAreaCircle += element.calculateArea();
//            } else if (element instanceof TriangleSecond) {
//                sumAreaTriangle += element.calculateArea();
//            }
//        }
//        System.out.println("Rectangle sum area = " + sumAreaRectangle);
//        System.out.println("Circle sum area = " + sumAreaCircle);
//        System.out.println("Triangle sum area = " + sumAreaTriangle);

        // Laboratory work 2_8_4

/*
        Rectangle[] arrayShape = new Rectangle[6];
        arrayShape[0] = new Rectangle("White", 5.6, 2.3);
        arrayShape[1] = new Rectangle("Red", 1.2, 3);
        arrayShape[2] = new Rectangle("Blue", 4, 3.2);
        arrayShape[3] = new Rectangle("Black", 0.2, 6.9);
        arrayShape[4] = new Rectangle("Yellow", 6.7, 10);
        arrayShape[5] = new Rectangle("Brown", 0.2, 6.9);
*/
        Arrays.sort(arrayShape);
        for (Shape element : arrayShape) {
            element.draw();
        }
    }
}
