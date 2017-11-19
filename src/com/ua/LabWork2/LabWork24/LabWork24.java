package com.ua.LabWork2.LabWork24;

public class LabWork24 {
    public static void main(String... args) {

//        lab243();
//        lab244();
//        lab245();
        // lab werk 2_4_7
        System.out.print(GravityCalculator.calculateDistance(60, 5.6, 0));
    }

    static void lab243() {
        int[] array1 = new int[]{2, 4, -5, 6, -23, 29};
        int result_int;
        float result_flot;
        result_int = MyMath.findMax(array1);
        System.out.println("Max value: " + result_int);
        result_int = MyMath.findMin(array1);
        System.out.println("Min value: " + result_int);
        result_flot = MyMath.areaOfCirce(0.25f);
        System.out.println("Area of circe: " + result_flot);
    }

    static void lab244() {
        EmployeeSecond empl_1 = new EmployeeSecond("Petrov");
        EmployeeSecond empl_2 = new EmployeeSecond("Ivanov");
        EmployeeSecond empl_3 = new EmployeeSecond("Sidorov");

        System.out.println("Created " + EmployeeSecond.numberOfEmployees + " new employee");
    }

    static void lab245() {
        System.out.println("Pi= " + MyMath.calcPi(100));
    }
}

class MyMath {
    final static float PI = 3.14f;

    public static float areaOfCirce(float radius) {
        return (radius * radius * PI);
    }

    public static int findMax(int... arg) {
        int result;
        if (arg.length > 0) {
            result = arg[0];
            for (int element : arg) {
                if (result < element) {
                    result = element;
                }
            }
            return result;
        } else {
            return result = 0;
        }
    }

    public static int findMin(int... arg) {
        int result;
        if (arg.length > 0) {
            result = arg[0];
            for (int element : arg) {
                if (result > element) {
                    result = element;
                }
            }
            return result;
        } else {
            return result = 0;
        }
    }

    public static double calcPi(int number) {
        double result = 4;
        double sing = -1;
        if (number >= 3) {
            for (double i = 3; i <= number; i += 2) {
                result += (4 / i) * sing;
                sing *= (-1);
            }
            return result;
        }
        return 0;
    }
}

class EmployeeSecond {
    protected String firstName;
    protected String lastName;
    public static int numberOfEmployees;
    protected String occupation;
    protected int phoneNumber;

    public EmployeeSecond(String firstName) {
        this(firstName, "", "volunteer", 0);
    }


    public EmployeeSecond(String firstName, String lastName) {
        this(firstName, lastName, "volunteer", 0);
    }

    public EmployeeSecond(String firstName, String lastName, String occupation) {
        this(firstName, lastName, occupation, 0);
    }

    public EmployeeSecond(String firstName, String lastName, String occupation, int phoneNumber) {
        numberOfEmployees++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

class GravityCalculator {
    public static final double ACCELERATION = 9.81;
    double position;
    double velocity;
    double time;

    public static double calculateDistance(double time, double velocity, double position) {
        return 0.5 * ACCELERATION * (time * time) + velocity * time + position;
    }
}