import java.util.Arrays;
import java.util.Scanner;

public class LabWork22 {
    public static void main(String... arg) {

//        lab21_22();
//        lab23();
//        lab24();
        lab25();
    }

    static void lab25() {
        SquareFigure geometricFigure = new SquareFigure();
        System.out.print(" Set the width and height ");
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int height = scan.nextInt();
        geometricFigure.getArea(width, height);

        System.out.println();
        System.out.print(" Set the radius ");
        int radius=scan.nextInt();
        geometricFigure.getArea(radius);

        System.out.println();
        System.out.print("Set the number from 2 to 10:");
        int number=scan.nextInt();
        SquareNumber resalt = new SquareNumber();
        resalt.getSquareNumber(number);

    }

    static void lab24() {
        Person volunteer = new Person();
        Scanner scan = new Scanner(System.in);

        System.out.println("Yuor first name and last name");
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        volunteer.personalInformaton(firstName, lastName);

        System.out.println("Set yuor gender and age");
        String gender=scan.nextLine();
        int age = scan.nextInt();
        volunteer.personalInformaton(gender, age);
        volunteer.personalInformaton(441234567);

        volunteer.getPersonalInformaton();

    }


    static void lab23() {
        Employee[] employeer = new Employee[3];
        employeer[0] = new Employee("Ivanov", 100.2, 110.0, 98.4, 120.0, 112.5);
        employeer[1] = new Employee("Petrov", 140.2, 136.2, 125.9, 142.3, 138.5);
        employeer[2] = new Employee("Sidorov", 120.5, 124.6, 115.0, 120.0, 121.8);

        for (Employee element : employeer) {
            element.calculateSalary();
        }

    }

    static void lab21_22() {
        int[][] firstMatrix;
        int[][] secondMatrix;
        int[][] resaltMatrix;

        firstMatrix = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 0}};
        secondMatrix = new int[][]{{11, 21, 12}, {22, 23, 32}, {33, 34, 43}};

        Matrix Matrix = new Matrix();
        Matrix.setArray(firstMatrix, secondMatrix);

        System.out.println("Addition of matrices");
        resaltMatrix = Matrix.getAdditionMatrix();
        for (int[] elementMatrix : resaltMatrix) {
            System.out.println(Arrays.toString(elementMatrix));
        }
        System.out.println("Matrix multiplication");
        resaltMatrix = Matrix.getMultiplicationMatrix();
        for (int[] elementMatrix : resaltMatrix) {
            System.out.println(Arrays.toString(elementMatrix));
        }

    }
}

class Matrix {
    protected int[][] array1;
    protected int[][] array2;
    protected int[][] resaltarray;
//    boolean theSizeOfTheMatricesIsTheSame = true;

    public void setArray(int[][] array1, int[][] array2) {
//        if (array1.length == array2.length) {
//            for (int row = 0; row < array1.length; row++) {
//                if (array1[row].length != array2[row].length) {
//                    theSizeOfTheMatricesIsTheSame = false;
//                    System.out.println("Matrices of the same size");
//                    break;
//                }
//            }
//
//        } else {
//            theSizeOfTheMatricesIsTheSame = false;
//            System.out.println("Matrices of the same size");
//        }

        this.array1 = array1;
        this.array2 = array2;
        this.resaltarray = new int[array1.length][array2.length];


    }

    public int[][] getAdditionMatrix() {
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                resaltarray[row][column] = array1[row][column] + array2[row][column];
            }
        }
        return resaltarray;
    }

    public int[][] getMultiplicationMatrix() {
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                resaltarray[row][column] = array1[row][column] * array2[column][row];
            }
        }
        return resaltarray;
    }
}

class Employee {
    protected String name;
    //    protected double[] salary=new double[12];
    protected double[] salary;

    public Employee(String name, double... salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        double totalSalary = 0;
        for (double element : this.salary) {
            totalSalary += element;
        }
        System.out.print("Name - " + name);
        System.out.println(". Total salary - " + totalSalary);

    }
}

class Accountant {

}

class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;
    protected int phoneNumber;

    public void personalInformaton(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void personalInformaton(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void personalInformaton(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getPersonalInformaton() {
        System.out.println(firstName + " " + lastName);
        System.out.println(gender + ", " + age + " years");
        System.out.print("Phonenumbe " + phoneNumber);

    }
}

class SquareFigure {
    //    protected int width;
//    protected int height;
//    protected int radius;
//    protected int area;
    final float PI = 3.1415f;

    public void getArea(int width, int height) {
        int result;
//        this.width=width;
//        this.height=height;

        result = width * height;
        System.out.println("Area = " + result);
    }

    public void getArea(int radius) {
        float result;
//       this.radius=radius;
        result = PI * radius * radius;
        System.out.println("Area of a circle " + result);

    }
}

class SquareNumber{
    public void getSquareNumber(int number){
        int resalt=number*number;
        System.out.print("Resalt "+number+" in square = ");
        System.out.println(resalt);
    }

}