package com.ua.LabWork2.LabWork27_28.brainacad.oop.testshapes;

 public class Shape implements Drawable {
    private String color;

     public Shape() {
         this("");
     }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public  double calculateArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "thi is Shape, color is " + color;
    }

    @Override
    public void draw() {
        System.out.printf("color is %s",color);
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

     public static Shape parseShape(String str){
 //       String str1 = str.substring(0,str.indexOf(":")).trim();
        switch (str.substring(0,str.indexOf(":")).trim()){
            case "circle": return new Circle("", 1);
            case "triangle": return new TriangleSecond("", 1, 1, 1);
            case "rectangle": return new Rectangle("", 1, 1);
            default: return new Shape();
        }

     }
}
