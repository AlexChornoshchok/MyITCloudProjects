package com.ua.LabWork2.labWork211;

public class TestExsiption {
    int y;

    public TestExsiption(int y) {
        this.y=y;
    }

    public int divisionEx(int x) throws MyExseption {
        int result;
        result = y/x;
        {
        MyExseption myEx  = new MyExseption("Divide by 0");
        throw myEx;
        }
 //       return result;
    }
}
