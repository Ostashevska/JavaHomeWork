package com.pb.ostashevska.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static boolean procedure(String value1, String value2) {
        String[] value1Parts = value1.split(" ");
        for (int i=0; i < value1Parts.length; i++) {
            char[] charArray = value1Parts[i].toCharArray();
            Arrays.sort(charArray);
            String sort1 = new String(charArray);
        }
        String Value1 = String.join("", value1Parts);
        String[] value2Parts = value2.split(" ");
        for (int i=0; i < value2Parts.length; i++) {
            char[] charArray = value1Parts[i].toCharArray();
            Arrays.sort(charArray);
            String sort2 = new String(charArray);
        }
        String Value2 = String.join("", value2Parts);
        boolean res = Value1.equalsIgnoreCase(Value2);
        if (res==true){
            System.out.println("рядки є анаграмами");
        } else { System.out.println("рядки не є анаграмами");}
        return res;
    }
    public static void main(String[] args) {
        System.out.println("введіть текст");
        Scanner in = new Scanner(System.in);
        String value1 = in.next();
        String value2 = in.next();

        System.out.println(procedure(value1, value2));
    }
}
