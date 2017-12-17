package com.ua.LabWork2.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Laboratory work 2_15_1
        List<String> myArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myArrayList.add("ArrayList_" + i);
        }
//        System.out.println(myArrayList);

        // laboratory work 2_15_2
        List<String> myLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add("LinkedList_" + i);
        }
 //       System.out.println(myLinkedList);

/*
        // Laboratory work 2_15_3
        Iterator<String> itrArrayList = myArrayList.iterator();
        Iterator<String> itrLinkedList = myLinkedList.iterator();

        while (itrArrayList.hasNext())
            System.out.print(itrArrayList.next() + " ");
        System.out.println();

        while (itrLinkedList.hasNext())
            System.out.print(itrLinkedList.next() + " ");
        System.out.println();

        ListIterator<String> itrList = myLinkedList.listIterator();
        while (itrList.hasNext()) {
            itrList.next();
            itrList.add(itrArrayList.next());
        }
        System.out.println(myLinkedList);
*/
/*
        // Laboratory work 2_15_4
        MyNumGenerator myGenert = new MyNumGenerator(20,35);
        System.out.println(myGenert.generate());

        // Laboratory work 2_15_5
        System.out.println(myGenert.generateDistinct());
*/

        // Laboratory work 2_15_6
        MyTranslator myTransletor = new MyTranslator();
        myTransletor.addNewWord("January", "Январь");
        myTransletor.addNewWord("February", "Февраль");
        myTransletor.addNewWord("March", "Май");
        myTransletor.addNewWord("April", "Апрель");
        myTransletor.addNewWord("May", "Май");
        myTransletor.addNewWord("June", "Июнь");
        myTransletor.addNewWord("July", "Июль");
        myTransletor.addNewWord("August", "Август");
        myTransletor.addNewWord("Setnyabr", "Сентябрь");
        myTransletor.addNewWord("October", "Октябрь");
        myTransletor.addNewWord("November", "Ноябрь");
        myTransletor.addNewWord("December", "Декабрь");

        System.out.println(myTransletor.translate("April"));
        System.out.println(myTransletor.translate("December"));
        System.out.println(myTransletor.translate("March"));
    }
}
