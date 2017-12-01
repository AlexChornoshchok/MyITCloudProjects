package com.ua.LabWork2.labWork211;

public class Main {
    public static void main(String... args) {

        // laboratory work 2_11_1
        int y = 0;
        System.out.println("Start MAIN");
//        testExeption(y);
        int i = testExeption2(y);
        System.out.println("i = " + i);

        System.out.println("End MAIN");

    }

    public static int testExeption2(int y) {
        int x;
        try {
            x = 10 / y;
            System.out.println("Result = " + x);
        } catch (Exception massag) {
            System.out.println("This is CATCH.");
            return ++y;
        } finally {
            System.out.println("This is FANAL.");
            return y += 10;
        }
    }

    TestExsiption testEx = new TestExsiption(10);

    try {
        int i = testEx.divisionEx(0);
        System.out.println("result "+i);
    } catch (MyExseption ex){
        System.out.println("Error massag: "+ex.getMessage());
    } catch (Exception ex) {
        System.out.println("Error.");
    }
}


