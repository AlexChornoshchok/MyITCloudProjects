package com.ua.LabWork2.labWork213Enum;

public enum Rank {

    ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");
    private String name;

    Rank(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public Rank nextRank() {
        switch (this) {
            case ACE:
                return Rank.TWO;
            case TWO:
                return Rank.THREE;
            case THREE:
                return Rank.FOUR;
            case FOUR:
                return Rank.FIVE;
            case FIVE:
                return Rank.SIX;
            case SIX:
                return Rank.SEVEN;
            case SEVEN:
                return Rank.EIGHT;
            case EIGHT:
                return Rank.NINE;
            case NINE:
                return Rank.TEN;
            case TEN:
                return Rank.JACK;
            case JACK:
                return Rank.QUEEN;
            case QUEEN:
                return Rank.KING;
            case KING:
                return Rank.ACE;
        }
        return null;
    }
}
