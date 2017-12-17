package com.ua.LabWork2.Generics;

public class MyMix <T> {
    private Object[] myArray;
    private int j;
    private Object element;

    public MyMix(T[] myArray) {
        this.myArray = myArray;
    }

    public T[] shuffleHalf (){
        for (int i = myArray.length-1; i > (myArray.length*0.5); i--) {
            j = (int)(Math.random()*(myArray.length*0.5));
            element = myArray[j];
            myArray[j] = myArray[i];
            myArray[i] = (T)element;
        }
        return (T[])myArray;
    }

    public T[] shuffleThird (){
        for (int i = 0; i < (myArray.length*0.3); i++) {
            j = (int)(Math.random()*(myArray.length));
            element = myArray[j];
            myArray[j] = myArray[i];
            myArray[i] = (T)element;
        }
        return (T[])myArray;
    }
}
