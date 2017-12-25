package com.ua.LabWork2.threads;

public class Storage {
    private  int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Storage number=" + number;
    }
}
