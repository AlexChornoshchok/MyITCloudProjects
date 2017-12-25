package com.ua.LabWork2.threads;

public class MyThread extends Thread {
    Object object1;
    Object object2;

    public MyThread(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Waiting objecr2");
        synchronized (object2){
            System.out.println(Thread.currentThread().getName() + " lock objetc2");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " again waiting objecr1 ");
            synchronized (object1){
                System.out.println("Lock object1");
            }
        }
    }
}
