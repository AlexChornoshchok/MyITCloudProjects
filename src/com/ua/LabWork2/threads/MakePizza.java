package com.ua.LabWork2.threads;

public class MakePizza implements Runnable {
    static int pizzaNum;

    public static int getPizzaNum() {
        return pizzaNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pizzaNum++;
            System.out.println("Pizza make." + (i+1));
        }
    }
}
