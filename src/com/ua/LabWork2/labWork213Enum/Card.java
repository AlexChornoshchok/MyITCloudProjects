package com.ua.LabWork2.labWork213Enum;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return ("The acrd: " + cardSuit +"_" + cardRank);
    }
}
