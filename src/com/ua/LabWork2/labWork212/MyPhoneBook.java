package com.ua.LabWork2.labWork212;

import java.util.Comparator;

public class MyPhoneBook implements Comparator{
    private PhoneNumber[] listPhoneNumbe = new PhoneNumber[10];
    private static int index = 0;

    public class PhoneNumber {
        String name;
        String number;

        public PhoneNumber(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Name = " + name +", phone number = " + number;
        }
    }

    public void addPhoneNumber(String name, String number){
        PhoneNumber newNamber = new PhoneNumber(name, number);
        if (index < 10) {
            listPhoneNumbe[index++] = newNamber;
        } else {
            System.out.println("The phone book is full");
        }
    }

    public void printPhoneBook(){
        for(PhoneNumber nextNamber: listPhoneNumbe){
            if(nextNamber == null){
                break;
            }
            System.out.println(nextNamber);
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public void sortByName() {


    }

    public void sortByPhoneNumber(){

    }


}

