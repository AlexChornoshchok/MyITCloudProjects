import java.util.Scanner;

public class LabWork15 {
    public static void main(String[] arg) {

//        lab1();
//        lab2();
//        lab3();
//        lab4();
//        lab5();
//        lab6();
        lab7();
//        lab8();
    }


    static void lab1() {
        int i = 0;

        while (i < 8) {
            i++;
            for (int n = i;n>0; n--) {
                System.out.print(n);
            }
            System.out.println();

        }
    }

    static void lab2(){
        int i;
        System.out.println("Enter number fro 1 to 9");
        i=2;
        if (i==1){
            System.out.println("One");
        }else if (i==2){
            System.out.println("Two");
        }else if (i==3){
            System.out.println("Three");
        }else if (i==4){
            System.out.println("Four");
        }else if (i==5){
            System.out.println("Five");
        }else if (i==6){
            System.out.println("Six");
        }else if (i==7){
            System.out.println("Seven");
        }else if (i==8){
            System.out.println("Eight");
        }else if (i==9){
            System.out.println("Nine");
        }
         switch (i){
             case 1:
                 System.out.println("One");
                 break;
             case 2:
                 System.out.println("Two");
                 break;
             case 3:
                 System.out.println("Three");
                 break;
             case 4:
                 System.out.println("Four");
                 break;
             case 5:
                 System.out.println("Five");
                 break;
             case 6:
                 System.out.println("Six");
                 break;
             case 7:
                 System.out.println("Seven");
                 break;
             case 8:
                 System.out.println("Eight");
                 break;
             case 9:
                 System.out.println("Nine");
                 break;

         }
    }

    static void lab3(){
//        for (int x=0;x<=9;x++){
//            if (x==0) {
//                System.out.print("*|\t");
//            } else {
//                System.out.print(x+"\t");
//            }
//        }
        int i=0;
        while (i<=19) {
            if (i==0) {
                System.out.print("*|\t");
            } else if(i<9) {
                System.out.print(i + "\t");
            } else if(i==9){
                System.out.println(i + "\t");
            }else{
                System.out.print("--\t");
            }
            i++;
        }

        System.out.println("");
        for (int x=1;x<=9;x++){
            System.out.print(x+"|\t");
            for (int y=1;y<=9;y++){
                System.out.print(x*y+"\t");

            }
            System.out.println("");
        }
    }

    static void lab4(){
        int counter=0;
        for(float f=1;f<300;f++){
            if (((f%3)==0)|((f%4)==0)){
                System.out.println((int)f);
                if(++counter==10){
                    break;
                }
            }
        }

    }

    static void lab5(){
        int sum,counter;
        sum=0;
        counter=12;
        for (int i=1;i<=counter;i++){
            sum=sum+i;
        }
        System.out.println("The Sum is: "+sum);
        System.out.println("The Avg is: "+(float)sum/counter);
    }

    static void lab6(){


    }

    static void lab7(){
        for(int n=1;n<1000;n++) {
            int sum=0;
            for(int m=1;m<=n/2;m++) {
                if(n%m==0){
                    sum=sum+m;
                }
            }
            if (n==sum) {
                System.out.println(sum);
            }
        }

    }

//    static void lab8(){
//        int requiredNumbe=7;
//        int[] arr={2,-14,7,34,18,-4};
//        for(int i=1;i<=arr.length;i++){
//
//
//        }
//
//    }
}
