package com.ua.LabWork2.LabWork25;

public class MyInitTest {
    int arg;
    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

     public MyInitTest(){
        this(1);
        System.out.println("constructor 1");
     }

    public MyInitTest(int arg){
        System.out.println("constructor 12");
        this.arg=arg;
    }
}
