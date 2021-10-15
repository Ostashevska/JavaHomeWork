package com.pb.ostashevska.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operand;
        System.out.println(" введіть ціле число ");
        operand= scan.nextInt();

        if (operand>=0 & operand<=14){
            System.out.println(" число з інтервалу [0-14] ");
        } else {
            if (operand>=15 & operand<=35) {
                System.out.println(" число з інтервалу [15-35] ");
            } else {
                if (operand>=36 & operand<=50) {
                    System.out.println(" число з інтервалу [36-50] ");
                } else {
                    if (operand>=51 & operand<=100) {
                        System.out.println(" число з інтервалу [51-100] ");
                    } else {
                        System.out.println(" число не входить у жоден із заданих інтервалів ");
                    }
            }

        }
        }
    }
}
