package com.ua.LabWork2.labWork213Enum;

public enum Suit {
    SPADE('\u2660'), DIAMOND('\u2662'), CLUB('\u2663'), HEART('\u2661');

    private char name;

    Suit(char name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ""+name;
    }

    public Suit nextSuit() {
        switch (this) {
            case SPADE:
                return Suit.DIAMOND;
            case DIAMOND:
                return Suit.CLUB;
            case CLUB:
                return Suit.HEART;
            case HEART:
                return Suit.SPADE;
        }
        return null;
    }
}
