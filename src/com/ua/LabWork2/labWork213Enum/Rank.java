package com.ua.LabWork2.labWork213Enum;

public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

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
