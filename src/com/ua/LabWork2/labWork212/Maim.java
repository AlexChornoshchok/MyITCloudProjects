package com.ua.LabWork2.labWork212;

public class Maim {
    public static void main(String... args) {

    MyPhoneBook newPhoneBook = new MyPhoneBook();
    newPhoneBook.addPhoneNumber("Ivan","25-687");
    newPhoneBook.addPhoneNumber("Anna","98-425");
    newPhoneBook.addPhoneNumber("Stepan","32-785");
    newPhoneBook.addPhoneNumber("Inga","45-691");
    newPhoneBook.addPhoneNumber("Petr","31-826");

    newPhoneBook.printPhoneBook();
    }
}
