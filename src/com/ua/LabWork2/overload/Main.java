package com.ua.LabWork2.overload;

public class Main {
    public static void main(String... args) {

        Animal myAnimal = new Animal();
        Dog myDog1 = new Dog();
        Animal myDog2 = new Dog();

        foo(myAnimal);
        foo(myDog1);
        foo(myDog2);
        foo((byte)5);

        byte b1 = 12;
        int i1 = 12;
//        foo(b1);
//        foo(2, 4, 5, 93);



    }

    public static void foo(Animal a) {
        System.out.println(a);
    }

    public  static void foo(Dog d) {
        System.out.println(d);
    }

    public  static void foo(Puppy p) {
        System.out.println(p);
    }
    public static void foo(byte b){
        System.out.println("Byte");
    }

    public static void foo(int i){
        System.out.println("Integer");
    }

    public static void foo(int i1, int i2){
        System.out.println("Integer, integer");
    }

    public static void foo(int... i){
        System.out.println("Integer array");
    }
}
