package com.ua.LabWork2.labWork214Generics;

public class MyTuple<A,B,C> {
    private A varA;
    private B varB;
    private C varC;

    public MyTuple(A varA, B varB, C varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public A getVarA() {
        return varA;
    }

    public B getVarB() {
        return varB;
    }

    public C getVarC() {
        return varC;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "varA= " + varA +
                ", varB= " + varB +
                ", varC= " + varC +
                '}';
    }
}
