package com.pb.ostashevska.hw4;
import java.util.Scanner;

public class Anagram {

    static boolean procedure(String value1, String value2) {
        boolean res = value1.equalsIgnoreCase(value2);
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
