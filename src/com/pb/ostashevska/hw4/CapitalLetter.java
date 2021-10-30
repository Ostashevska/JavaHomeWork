package com.pb.ostashevska.hw4;
import java.util.Scanner;

public class CapitalLetter {

   static String procedure(String value) {
      String[] valueParts = value.split(" ");

           for (int i=0; i < valueParts.length; i++) {

           valueParts [i] = valueParts[i].substring(0, 1).toUpperCase() + valueParts[i].substring(1).toLowerCase();
       }
       String Value = String.join(" ", valueParts);
       return Value;
    }
    public static void main(String[] args) {
        System.out.println("введіть текст");
        Scanner in = new Scanner(System.in);
        String value = in.next();

       System.out.println(procedure(value));
    }
}
