package com.ua.LabWork2.labWork212;

public class MyTestClass {

    public static class MyStaticNested{

    }

    static class MyInner {}

    void test(){

        class MyLocal{}

        MyLocal myLocalClass = new MyLocal();
    }

}
