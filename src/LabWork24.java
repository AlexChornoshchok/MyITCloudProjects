import java.util.Arrays;

public class LabWork24 {
    public static void main(String... args) {

//        lab243();
//        lab244();
        lab245();
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
        Employee_1 empl_1 = new Employee_1("Petrov");
        Employee_1 empl_2 = new Employee_1("Ivanov");
        Employee_1 empl_3 = new Employee_1("Sidorov");

        System.out.println("Created " + Employee_1.numberOfEmployees + " new employee");
    }

    static void lab245() {
        System.out.println("Pi= "+MyMath.calcPi(100));
    }
}


//class Calculation {
//    int[] array1 = new int[]{2, 4, -5, 6, -23, 29};
//    int result;
//    result = MyMath.findMax(array1);
//}

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
        } else {
            result = 0;
        }
        return result;
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
        } else {
            result = 0;
        }
        return result;
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

class Employee_1 {
    protected String firstName;
    protected String lastName;
    public static int numberOfEmployees;
    protected String occupation;
    protected int phoneNumber;

//    public Employee_1(){
//
//    }

    public Employee_1(String firstName) {
        this(firstName, "", "volunteer", 0);
    }


    public Employee_1(String firstName, String lastName) {
        this(firstName, lastName, "volunteer", 0);
    }

    public Employee_1(String firstName, String lastName, String occupation) {
        this(firstName, lastName, occupation, 0);
    }

    public Employee_1(String firstName, String lastName, String occupation, int phoneNumber) {
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