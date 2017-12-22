package com.ua.LabWork2.Thread;

public class Printer implements Runnable {

    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(storage.getNumber());
    }
}
