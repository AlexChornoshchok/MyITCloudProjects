package com.ua.LabWork2.LabWork25;

public class InitTest {
    private int id;
    private static int nextId;

    static {
        nextId = (int) (1000 * Math.random());
    }

    public InitTest(int id) {
        this.id = id;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    @Override
    public String toString() {
        return "InitTest{" +
                "id= " + id + ", " +
                "nextId= " + nextId +
                '}';
    }
}
