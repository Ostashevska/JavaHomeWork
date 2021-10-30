package com.pb.ostashevska.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static boolean procedure(String value1, String value2) {
        value1 = value1.toLowerCase();
        value2 = value2.toLowerCase();

        String[] value1Parts = value1.split(" ");
        for (int i=0; i < value1Parts.length; i++) {
            char[] charArray = value1Parts[i].toCharArray();
            Arrays.sort(charArray);
            String sort1 = new String(charArray);
            System.out.println(sort1);
        }
        String Value1 = String.join(" ",value1Parts);
        System.out.println(Value1);

        String[] value2Parts = value2.split(" ");
        for (int i=0; i < value2Parts.length; i++) {
            char[] charArray = value2Parts[i].toCharArray();
            Arrays.sort(charArray);
            String sort2 = new String(charArray);
            System.out.println(sort2);
        }
        String Value2 = String.join(" ", value2Parts);
        System.out.println(Value2);

        return value1.equals(value2);

    }
    public static void main(String[] args) {
        System.out.println("введіть текст");
        Scanner in = new Scanner(System.in);
        String value1 = in.next();
        String value2 = in.next();

        System.out.println(procedure(value1, value2));

        boolean res = value1.equals(value2);
        if (res==true){
            System.out.println("рядки є анаграмами");
        } else { System.out.println("рядки не є анаграмами");}

    }
}
