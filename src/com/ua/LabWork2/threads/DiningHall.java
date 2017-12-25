package com.ua.LabWork2.threads;

public class DiningHall implements Runnable {
    MakePizza pizza;
    static int studentID = 1;
    String result;

    public DiningHall(MakePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void run() {
        synchronized (pizza) {
            if (pizza.pizzaNum != 0) {
                result = "Served ";
                pizza.pizzaNum--;
            } else result = "Starved ";
            System.out.println(result + studentID);
            studentID++;
        }
    }
}
