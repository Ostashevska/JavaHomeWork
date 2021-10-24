package com.pb.ostashevska.hw3;
import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть 10 цілих чисел");
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            int a = scan.nextInt();
            array[i] = a;
        }

        System.out.println("Ви ввели: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сума усіх елементів масиву " + sum);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                j++;
            }
        }
        System.out.println("Додатніх елементів - " + j);
        System.out.println("Відсортовані елементи: ");

        int buf;
        for (int y = 10; y >= 1; y--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i]>array[i+1]){
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }System.out.println(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}



