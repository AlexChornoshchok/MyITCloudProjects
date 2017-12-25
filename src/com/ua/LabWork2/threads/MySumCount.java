package com.ua.LabWork2.threads;

public class MySumCount implements Runnable {

    private int startIndex;
    private int stopIndex;
    private int[] intArray;
    private long resultSum;

    public long getResultSum() {
        return resultSum;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        this.resultSum = intArray[startIndex];
        if ((stopIndex - startIndex) > 0) {
            for (int i = startIndex + 1; i <= stopIndex; i++) {
//            System.out.println(Thread.currentThread().getName());
                this.resultSum += intArray[i];
//            System.out.println(this.resultSum);
            }
        } else if((stopIndex - startIndex) < 0) {
            for (int i = 0; i < stopIndex; i++) {
                this.resultSum += intArray[i];
            }
            for (int i = startIndex-1; i < intArray.length; i++) {
                this.resultSum += intArray[i];
            }
        }
    }
}
