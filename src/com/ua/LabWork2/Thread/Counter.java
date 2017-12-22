package com.ua.LabWork2.Thread;

public class Counter implements Runnable {

    Storage storege;

    public Counter(Storage storege) {
        this.storege = storege;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
             storege.setNumber(i);
        }
    }
}
