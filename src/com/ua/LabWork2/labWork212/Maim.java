package com.ua.LabWork2.labWork212;

public class Maim {
    public static void main(String... args) {

/*
        // laboratory work 2_12_1,2
        MyPhoneBook newPhoneBook = new MyPhoneBook();
        newPhoneBook.addPhoneNumber("Ivan", "25-687");
        newPhoneBook.addPhoneNumber("Anna", "98-425");
        newPhoneBook.addPhoneNumber("Stepan", "32-785");
        newPhoneBook.addPhoneNumber("Inga", "45-691");
        newPhoneBook.addPhoneNumber("Petr", "31-826");

        newPhoneBook.printPhoneBook();
        System.out.println("*Name*");
        newPhoneBook.sortByName();
        newPhoneBook.printPhoneBook();
        System.out.println("*Phone namber*");
        newPhoneBook.sortByPhoneNumber();
        newPhoneBook.printPhoneBook();
*/
        // Laboratory work 2_12_3
        MyPhone newPhoneBook = new MyPhone();
        newPhoneBook.swichOn();
        newPhoneBook.coll(6);

        // Laboratory work 2_12_5
        MyTestClass.MyStaticNested myStaticClass = new MyTestClass.MyStaticNested();
        MyTestClass myTestClass = new MyTestClass();
        MyTestClass.MyInner myInner = new MyTestClass.MyInner();

    }
}
