package com.ua.LabWork2.labWork213Enum;

public enum Suit {
    SPADE, DIAMOND, CLUB, HEART;

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
