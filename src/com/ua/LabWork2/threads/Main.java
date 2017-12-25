package com.ua.LabWork2.threads;

import java.util.concurrent.ConcurrentHashMap;

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
//            myArray[i] = (int)(Math.random()*500);
            myArray[i] = i;
        }
        System.out.println(Arrays.toString(myArray));
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        mySumCount1.setStartIndex(800);
        mySumCount1.setStopIndex(320);
        mySumCount1.setIntArray(myArray);
        mySumCount2.setStartIndex(300);
        mySumCount2.setStopIndex(520);
        mySumCount2.setIntArray(myArray);
//        mySumCount.run();
        Thread thr2 = new Thread(mySumCount1);
        Thread thr3 = new Thread(mySumCount2);
        thr2.start();
        thr3.start();
        try {
            thr2.join();
            thr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of the first array elements: " + mySumCount1.getResultSum());
        System.out.println("Sum of the second array elements: " + mySumCount2.getResultSum());
*/

/*
        //Laboratory work 2_17_5
        Storage storage = new Storage();
        storage.setNumber(10);
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);
        Thread thr4 = new Thread(counter);
        thr4.setName("Thread counter");
        Thread thr5 = new Thread(printer);
        thr5.setName("Thred printer");
        thr5.start();
        thr4.start();
*/

/*
        // Laboratory work 2_17_6
        MakePizza makePizza = new MakePizza();
        DiningHall diningHall = new DiningHall(makePizza);
        Thread thrNMkePizza = new Thread(makePizza);
        Thread[] thrArray = new Thread[20];
        thrNMkePizza.start();
        for (int i = 0; i < 20; i++) {
            thrArray[i] = new Thread(diningHall);
            thrArray[i].start();
        }
*/

/*
        // Laboratory work 2_17_9
        Object obj1 = new Object();
        Object obj2 = new Object();
        MyThread myThreads = new MyThread(obj1, obj2);
        MyObject myObjects = new MyObject(obj1, obj2);

        Thread[] thr6 = new Thread[6];

        for (int i = 0; i < 6; i++) {
            thr6[i] = new Thread(myThreads);
            thr6[++i] = new Thread(myObjects);
        }
        for (Thread thr: thr6) {
            thr.start();
        }
*/

        // Laboratory work 2_17_10
        ConcurrentHashMap<Integer, String> conHashMap = new ConcurrentHashMap<>();

    }
}
