package com.pb.ostashevska.hw2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println(" введіть значення 1 ");
        operand1= scan.nextInt();

        System.out.println(" введіть значення 2  ");
        operand2= scan.nextInt();

        System.out.println(" введіть знак арифметичної операції ");
        sign= scan.next();

        int result;

        char s = sign.charAt(0);
        switch (s) {
            case '+':
                result = operand1+operand2;
                System.out.println(" Результат = " + result);
                break;
            case '-':
                result = operand1-operand2;
                System.out.println(" Результат = " + result);
                break;
            case '*':
                result = operand1*operand2;
                System.out.println("Результат = " + result);
                break;
            case '/':
                if (operand2!=0) {
                    result = operand1 / operand2;
                    System.out.println(" Результат = " + result);
                }
                else {
                    System.out.println(" Ділення на 0 заборонено");
                }
                break;
            default:
                System.out.println("Невірно введений оператор");
        }

    }
}
