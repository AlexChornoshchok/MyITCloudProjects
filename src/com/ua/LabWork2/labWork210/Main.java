package com.ua.LabWork2.labWork210;

import com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes.*;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {

//        // Laboratory work 2_10_1
//        Integer x1 = 210;
//        Integer x2 = new Integer(210);
//        Integer x3 = Integer.valueOf(210);
//        Integer x4 = Integer.parseInt("210");
//        System.out.println((x1 == x2)+" -> "+x1.toString());
//        System.out.println(x1 == x3);
//        System.out.println(x1 == x4);
//        System.out.println(x1.MAX_VALUE);
//        System.out.println(x2.MIN_VALUE);
//        System.out.println(x3.BYTES);
//        System.out.println(x4.TYPE);

//        // Laboratory work 2_10_2
//        Byte b1 = 10;
//        Integer i1 = 500;
//        System.out.println(compute(b1, i1));

        // Laboratory work 2_10_3
        Shape[] groupShape;
        String[] arrayStr = {"Rectangle:RED:10,20",
                "Triangle:GREEN:9,7,12",
                "Circle:BLACK:10"};

/*      // Laboratory work 2_10_4
        groupShape = new Shape[arrayStr.length];
        for (int index = 0; index < arrayStr.length; index++) {
            groupShape[index] = Shape.parseShape(arrayStr[index]);
            groupShape[index].draw();
        }
*/

        // Laboratory work 2_10_5
        StringBuilder strBuild = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 3");
        String[] arrayStr1 = new String[scan.nextInt()];
        for (int index = 0; index < arrayStr1.length; index++) {
            System.out.print("Enter the shape name: ");
            strBuild.append((scan.next() + ":"));

            switch (strBuild.toString().toLowerCase()) {
                case "circle:":
                    System.out.print("Enter the color of the shape: ");
                    strBuild.append((scan.next() + ":"));
                    System.out.print("Enter the radius: ");
                    strBuild.append(scan.next());
                    break;
                case "rectangle:":
                    System.out.print("Enter the color of the shape: ");
                    strBuild.append((scan.next() + ":"));
                    System.out.println("Enter the values of 2 sides: ");
                    strBuild.append((scan.next() + ","));
                    strBuild.append(scan.next());
                    break;
                case "triangle:":
                    System.out.print("Enter the color of the shape: ");
                    strBuild.append((scan.next() + ":"));
                    System.out.println("Enter the values of 3 sides: ");
                    strBuild.append((scan.next() + ","));
                    strBuild.append((scan.next() + ","));
                    strBuild.append(scan.next());
                    break;
                default:
                    System.out.println("Wrong date");
                    break;

            }
            arrayStr1[index] = strBuild.toString();
            strBuild.setLength(0);
        }
        groupShape = new Shape[arrayStr1.length];
        for (int index = 0; index < arrayStr1.length; index++) {
            groupShape[index] = Shape.parseShape(arrayStr1[index]);
            groupShape[index].draw();
        }

    }

    static Long compute(Byte b, Integer i) {
        return (b.longValue() + i.longValue());
    }
}
