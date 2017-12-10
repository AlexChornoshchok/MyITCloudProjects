package com.ua.LabWork2.labWork214Generics;

public class Main {
    public static void main(String... args) {

        // Laboratory work 2_14_1
        MyTuple<String, Integer, Long> myT1 = new MyTuple<>( "1 variable", 15, 34758L );
        MyTuple<Double, String, String> myT2 = new MyTuple<>(4567.6, "2 variable", "null");

        System.out.println(myT1);
        System.out.println(myT2);
    }
}
