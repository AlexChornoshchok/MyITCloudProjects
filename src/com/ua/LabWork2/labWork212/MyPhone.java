package com.ua.LabWork2.labWork212;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    private MyPhoneBook newPhoneBook = new MyPhoneBook();

    public MyPhone() {
    }

    public void swichOn() {
        System.out.println("Loading PhoneBook records…");
        newPhoneBook.addPhoneNumber("Ivan", "25-687");
        newPhoneBook.addPhoneNumber("Anna", "98-425");
        newPhoneBook.addPhoneNumber("Stepan", "32-785");
        newPhoneBook.addPhoneNumber("Inga", "45-691");
        newPhoneBook.addPhoneNumber("Petr", "31-826");
        newPhoneBook.printPhoneBook();
        System.out.println("OK");
    }

    public void coll(int bookEntryNumber) {
        System.out.println("Calling to " +bookEntryNumber);
        if (bookEntryNumber <= 10) {
            if (newPhoneBook.listPhoneNumbe[bookEntryNumber] == null){
                System.out.printf("Record number %d is empty. %n", bookEntryNumber);
            } else {
            System.out.println(newPhoneBook.listPhoneNumbe[bookEntryNumber].toString());
            }
        } else {
            System.out.println("No records with this number.");
        }
    }

    private class MyPhoneBook {
        public PhoneNumber[] listPhoneNumbe = new PhoneNumber[10];
        private int index = 0;

        public class PhoneNumber {
            private String name;
            private String number;

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
                return "Name = " + name + ", phone number = " + number;
            }
        }

        public void addPhoneNumber(String name, String number) {
            PhoneNumber newNamber = new PhoneNumber(name, number);
            if (this.index < 10) {
                listPhoneNumbe[this.index++] = newNamber;
            } else {
                System.out.println("The phone book is full");
            }
        }

        public void printPhoneBook() {
            for (PhoneNumber nextNamber : listPhoneNumbe) {
                if (nextNamber == null) {
                    break;
                }
                System.out.println(nextNamber);
            }
        }

        private void sortByName() {
 //           Arrays.sort(listPhoneNumbe, new SortName());
            Arrays.sort(listPhoneNumbe, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber obj1, PhoneNumber obj2) {
                    if (obj1 == null || obj2 == null) {
                        return 0;
                    } else {
                        return obj1.getName().compareTo(obj2.getName());
                    }
                }
            });
        }

        private void sortByPhoneNumber() {
//            Arrays.sort(listPhoneNumbe, new SortPhoneNumber());
            Arrays.sort(listPhoneNumbe, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber obj1, PhoneNumber obj2) {
                    if (obj1 == null || obj2 == null) {
                        return 0;
                    } else {
                        return obj1.getNumber().compareTo(obj2.getNumber());
                    }
                }
            });
        }

        private class SortName implements Comparator<PhoneNumber> {
            @Override
            public int compare(PhoneNumber obj1, PhoneNumber obj2) {
                if (obj1 == null || obj2 == null) {
                    return 0;
                } else {
                    return obj1.getName().compareTo(obj2.getName());
                }
            }
        }

        private class SortPhoneNumber implements Comparator<PhoneNumber> {
            @Override
            public int compare(PhoneNumber obj1, PhoneNumber obj2) {
                if (obj1 == null || obj2 == null) {
                    return 0;
                } else {
                    return obj1.getNumber().compareTo(obj2.getNumber());
                }
            }
        }
    }

    private class Camera{}

    private class Bluetooth{}

    private class PowerOnButton{}

    private class HeadPhones{}

    private class PhoneBattery{}

    private class PhoneDisplay{}

    private class PhoneSpeaker{}
}

