package com.ua.LabWork2.threads;

public class Printer implements Runnable {

    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            try {
                storage.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(storage.getNumber());
        }
    }
}
