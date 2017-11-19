package com.ua.LabWork2.LabWork21;

public class LabWork21 {

    public static void main(String... arg) {

        Computer[] computers = new Computer[5];

        for (int index = 0; index < computers.length; index++) {
            computers[index] = new Computer();
            computers[index].setManufacture("Dell");
            computers[index].setSerialNumber(index + 10);
            computers[index].setFrequencyCPU(1200);
            computers[index].setQuantityCPU(2);
            computers[index].setPrice(100f);
        }


        for (Computer element : computers) {
            element.setPrice(element.getPrice() * 1.1f);
        }
        for (Computer element : computers) {
            element.viewComputerFields();
            System.out.println();

        }

    }
}

class Computer {

    protected String manufacture;
    protected int serialNumber;
    protected float price;
    protected int quantityCPU;
    protected int frequencyCPU;

    public String getMmanufacture() {
        return manufacture;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
    public void viewComputerFields(){
        System.out.print("manufacture - "+manufacture +"; ");
        System.out.print("serialNumber - "+serialNumber+"; ");
        System.out.print("price - "+price +"; ");
        System.out.print("quantityCPU -  "+quantityCPU +"; ");
        System.out.print("frequencyCPU - "+frequencyCPU +"; ");
    }
}


