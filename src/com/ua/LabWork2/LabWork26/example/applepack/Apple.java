package com.ua.LabWork2.LabWork26.example.applepack;

public class Apple {
    double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple weight = " + weight +" kg.";
    }

    public double getMass() {
        return weight;
    }

    public void setMass(double weight) {
        this.weight = weight;
    }
}
