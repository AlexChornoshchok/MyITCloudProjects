package com.ua.LabWork2.labWork29;

import java.io.PrintStream;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final Pattern MY_PATTERN = Pattern.compile("\\p{Upper}\\p{Lower}*");

    public static void main(String... args) {


        // Laboratory work 2_9_1
//        String myStr = "abracadabra";
//        String subStr = "ra";
//        System.out.printf("Rirst index of occurrence of a substring %s in a string %d%n", subStr, myStr.indexOf(subStr));
//        System.out.printf("Last index of occurrence of a substring %s in a string %d%n", subStr, myStr.lastIndexOf(subStr));
//        System.out.println(myStr.substring(3, 7));
//        System.out.println(reversString(myStr));

//        // Laboratory work 2_9_2
//        String myStr1 = "Cartoon";
//        String myStr2 = "Tomcat";
//        for (int index=0; index < myStr1.length(); index++) {
//            if (myStr2.indexOf(myStr1.charAt(index))<0) {
//                System.out.println(myStr1.charAt(index));
//                continue;
//            }
//        }

//        // Laboratory work 2_9_3
//        String myStr3 = "Create a class";
//        uniqueChars(myStr3);

//        // Laboratory work 2_9_4
//        String myStr4 = "This is String, split by StringTokenizer. Created by Student Aleksandr";
//        StringTokenizer strToken = new StringTokenizer(myStr4, ".");
//        while (strToken.hasMoreTokens()) {
//            System.out.println(strToken.nextToken().trim());
//        }

        // Laboratory work 2_9_5
        String[] myArrayStr = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", ""};
        for (String element : myArrayStr) {
            System.out.print(element + ": ");
            System.out.println(checkPersonWithRegExp(element));
        }
    }

    static String reversString(String str) {
        StringBuffer strBuf = new StringBuffer(str);
        strBuf.reverse();
        return strBuf.toString();
    }

    static void uniqueChars(String str) {
        for (int index = 0; index < str.length(); index++) {
            char ch1 = str.charAt(index);
            if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
                System.out.println(ch1);
                continue;
            }
        }
    }

    public static boolean checkPersonWithRegExp(String str) {
        Matcher myMatche = MY_PATTERN.matcher(str);
        return myMatche.matches();
    }
}
