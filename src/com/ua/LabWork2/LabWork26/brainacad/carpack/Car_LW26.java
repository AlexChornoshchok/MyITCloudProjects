package com.ua.LabWork2.LabWork26.brainacad.carpack;

public class Car_LW26 {
    double weight;

    public Car_LW26(double weight) {
        this.weight = weight;
    }

    public double getMass() {
        return weight;
    }

    public void setMass(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car weight = " + weight +" kg.";
    }
}
