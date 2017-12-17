package com.ua.LabWork2.Generics;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {

/*
        // Laboratory work 2_14_1
        MyTuple<String, Integer, Long> myT1 = new MyTuple<>( "1 variable", 15, 34758L );
        MyTuple<Double, String, String> myT2 = new MyTuple<>(4567.6, "2 variable", "null");

        System.out.println(myT1);
        System.out.println(myT2);
*/
        // Laboratory work 2_14_4
        int[] arr = {1,2,3,4,5,6,7,8};
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] strArray  = {"one", "two", "three", "four", "five", "six", "seven", "eight",};

        System.out.println(Arrays.toString(intArray));
        MyMix <Integer> intMyMix = new MyMix<>(intArray);
//        System.out.println("Half: " + Arrays.toString(intMyMix.shuffleHalf()));
        System.out.println("Third: " + Arrays.toString(intMyMix.shuffleThird()));

        System.out.println(Arrays.toString(strArray));
        MyMix <String> strMyMix = new MyMix<>(strArray);
//        System.out.println("Half: " + Arrays.toString(strMyMix.shuffleHalf()));
        System.out.println("Third: " + Arrays.toString(strMyMix.shuffleThird()));

    }
}
