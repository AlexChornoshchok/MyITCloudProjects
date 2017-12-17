package com.ua.LabWork2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Integer.*;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate(){
        List<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            myArrayList.add((int)(Math.random()*maxNumb));
        }
        return myArrayList;
    }

    public Set generateDistinct(){
        Set<Integer> myHeshSet = new HashSet<>();
        int j=1;
        while (j <= numOfElm){
            int number = (int)(Math.random()*maxNumb);
            if (!myHeshSet.contains(number)){
                myHeshSet.add(number);
                j++;
            }
        }
        return myHeshSet;
    }
}
