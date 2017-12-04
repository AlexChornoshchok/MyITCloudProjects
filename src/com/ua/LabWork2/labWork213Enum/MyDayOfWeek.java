package com.ua.LabWork2.labWork213Enum;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public void nextDay() {
        switch (this) {
            case SUNDAY:
                System.out.println("Next day " + MyDayOfWeek.MONDAY);
                break;
            case MONDAY:
                System.out.println("Next day " + MyDayOfWeek.TUESDAY);
                break;
            case TUESDAY:
                System.out.println("Next day " + MyDayOfWeek.WEDNESDAY);
                break;
            case WEDNESDAY:
                System.out.println("Next day " + MyDayOfWeek.THURSDAY);
                break;
            case THURSDAY:
                System.out.println("Next day " + MyDayOfWeek.FRIDAY);
                break;
            case FRIDAY:
                System.out.println("Next day " + MyDayOfWeek.SATURDAY);
                break;
            case SATURDAY:
                System.out.println("Next day " + MyDayOfWeek.SUNDAY);
        }
    }
}
