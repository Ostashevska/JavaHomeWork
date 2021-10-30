package com.pb.ostashevska.hw4;
import java.util.Scanner;

public class CapitalLetter {

   static String procedure(String value) {
       String Value = value.toUpperCase();
       return Value;
    }
    public static void main(String[] args) {
        System.out.println("введіть текст");
        Scanner in = new Scanner(System.in);
        String value = in.next();

       System.out.println(procedure(value));
    }
}
