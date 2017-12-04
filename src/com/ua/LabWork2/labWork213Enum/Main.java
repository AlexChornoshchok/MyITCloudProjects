package com.ua.LabWork2.labWork213Enum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {

 /*       // Laboratory work 2_13_1
        for(MyDayOfWeek element : MyDayOfWeek.values()){
            System.out.println("Name = "+element.name()+", ordinal = "+element.ordinal());
        }
*/
 /*       // Laboratory work 2_13_2
        for(MyDayOfWeek element : MyDayOfWeek.values()){
            switch (element){
                case MONDAY:
                case TUESDAY:
                case FRIDAY: System.out.println("My Java day:"+element);
            }
        }
*/

/*
        // Laboratory work 2_13_4
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        MyDayOfWeek nextDay = MyDayOfWeek.valueOf(scan.nextLine());
        nextDay.nextDay();
*/

        // Laboratory work 2_13_5
        //enum  Suit {SPADE, DIAMOND, CLUB, HEART};

        Card[] cardDeck = new Card[52];
        Suit newSuit = Suit.CLUB;
        Rank newRank = Rank.ACE;
        for (int suteIndex = 0; suteIndex < 4; suteIndex++){
            newSuit = newSuit.nextSuit();
            for (int rankIndex = 0; rankIndex < 13; rankIndex++) {
                newRank = newRank.nextRank();
                cardDeck[suteIndex * 13 + rankIndex] = new Card(newSuit, newRank);
            }
        }

 //       Arrays.toString(cardDeck);
        for(Card element: cardDeck)
        System.out.println(element.toString());
    }
}
