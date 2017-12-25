package com.ua.LabWork2.threads;

public class Counter implements Runnable {

    Storage storege;

    public Counter(Storage storege) {
        this.storege = storege;
    }

    @Override
    public void run() {
        synchronized (storege) {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1_000_000; i++) {
                storege.setNumber(storege.getNumber() + 1);
            }
            System.out.println(Thread.currentThread().getName() + " finished. Result: " + storege.getNumber());
            storege.notify();
        }
    }
}
