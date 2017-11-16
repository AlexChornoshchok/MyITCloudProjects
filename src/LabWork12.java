import java.util.Scanner;

public class LabWork12 {
    public static void main(String[] arg){

        LabWork_12_1();
        LabWork_12_2();
    }
    static void LabWork_12_1() {
        System.out.println("Hello ItCloud");

        System.out.println("  ***   *   *     *   *");
        System.out.println("    *  * *   *   *   * *");
        System.out.println("    * *   *  *   *  *   *");
        System.out.println("*   * *****   * *   *****");
        System.out.println(" ***  *   *    *    *   *");
        
    }
    static void LabWork_12_2() {
            System.out.println("Wat is you Name?");
        //объекты именуются с маленькой буквы
            Scanner ScNew = new Scanner(System.in);
            String line = ScNew.nextLine();
            System.out.print("Hallo, "+line+"!");
        }
}
