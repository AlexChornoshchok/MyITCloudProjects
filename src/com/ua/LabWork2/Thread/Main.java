package com.ua.LabWork2.Thread;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {

/*
        // Laboratory work 2_17_1,2
        Runnable boom1 = new MyTimeBomb();
        Thread thr1 = new Thread(boom1);
        thr1.start();
*/

/*
        //Laboratory work 2_17_3,4
        int[] myArray = new int[1000];
        for (int i = 0; i < 1000; i++) {
            myArray[i] = (int)(Math.random()*500);
        }
        System.out.println(Arrays.toString(myArray));
        MySumCount mySumCount = new MySumCount();
        mySumCount.setStartIndex(300);
        mySumCount.setStopIndex(520);
        mySumCount.setIntArray(myArray);
        Thread thr2 = new Thread(mySumCount);
        Thread thr3 = new Thread(mySumCount);
        thr2.start();
        thr3.start();
        try {
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of array elements: " + mySumCount.getResultSum());
*/

        //Laboratory work 2_17_5
        Storage storage = new Storage();
        storage.setNumber(1000);
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);
        Thread thr4 = new Thread(counter);
        thr4.setName("Thread counter");
        Thread thr5 = new Thread(printer);
        thr5.setName("Thred printer");
        thr4.start();
        thr5.start();


    }
}
