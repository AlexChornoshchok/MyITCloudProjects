package com.ua.LabWork2.LabWork25;

import java.util.Arrays;

public class MyInit {
    static int[] array = new int[10];

    static {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
