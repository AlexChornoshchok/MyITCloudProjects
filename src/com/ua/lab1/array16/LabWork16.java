package com.ua.lab1.array16;

import java.util.Arrays;

public class LabWork16 {
    public static void main(String[] arg) {

//        lab1();
//        lab6();
        lab7();
    }

    static void lab7() {
        int requiredNumber=1;
        int[][] arr = {{1, 1, 1, 3, 4},
                       {2, 3, 1, 4, 1},
                       {4, 5, 6, 7, 8},
                       {2, 1, 4, 0, 6}};
        for (int iterator1Level=0;iterator1Level<arr.length;iterator1Level++){
            System.out.print("Line "+iterator1Level+": [");
            for (int iterator2Level=0;iterator2Level<arr[iterator1Level].length;iterator2Level++){
                if(arr[iterator1Level][iterator2Level]==requiredNumber){
//                    if() {
                        System.out.print(iterator2Level + ",");
//                    }
                }
            }
            System.out.println("]");
        }
    }

    static void lab6() {
        int[] initialArray = {-1, -3, 0, -9, -5, -6, 0, -4, -3, -10, 0, -6};
        int[] resaltArray = new int[initialArray.length];

        if ((initialArray.length == 0) || (initialArray.length == 1)) {
            System.out.println("The matrix con not be sorted");
        } else if (initialArray.length == 2) {
            if (initialArray[0] > initialArray[1]) {
                resaltArray[0] = initialArray[1];
                resaltArray[1] = initialArray[0];
            }
        } else {
            int numberOfPositiveElements = 0;
            int index = 0;
            for (int element : initialArray) {
                if (element < 0) {
                    resaltArray[index] = element;
                    index++;
                } else if (element > 0) {
                    numberOfPositiveElements++;
                }
            }
            if (numberOfPositiveElements != 0) {
                index = initialArray.length - numberOfPositiveElements;
                for (int element : initialArray) {
                    if (element > 0) {
                        resaltArray[index] = element;
                        index++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(resaltArray));
    }

    static void lab1() {
        final int d = 30;
        int[] arr1 = new int[15];
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                arr1[i / 2 - 1] = i;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
