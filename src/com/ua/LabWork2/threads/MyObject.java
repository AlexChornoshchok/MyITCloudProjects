package com.ua.LabWork2.threads;

public class MyObject extends Thread {
    Object object1;
    Object object2;

    public MyObject(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Waiting objecr1");
        synchronized (object1){
            System.out.println(Thread.currentThread().getName() + " lock objetc1");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " again waiting objecr2");
            synchronized (object2){
                System.out.println("Lock object2");
            }
        }
    }
}
