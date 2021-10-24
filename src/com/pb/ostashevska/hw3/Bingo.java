package com.pb.ostashevska.hw3;
import java.util.Scanner;
import java.util.Random;

public class Bingo {

    public static void main(String[] args) {
        System.out.println(" Вгадайте ціле число від 0 до 100 з трьох спроб");
        System.out.println("Для виходу з програми введіть - exit.");

        Random random = new Random();
        int val = random.nextInt(101);
        Scanner in = new Scanner(System.in);
        int j = 0;
        final int MAX_j = 3;
        while (j < MAX_j) {
            j++;
            System.out.println("Спроба " + j + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;
            }
            int v1 = Integer.parseInt(value.trim());
            if (!value.equals(val)) {
                if(v1>val) {
                    System.out.println("Ваше число більше загаданого");
                } else {
                    System.out.println("Ваше число менше загаданого");
                }
                continue;
            }
            System.out.println("Bingo! , Ви вгадали з " + j + " спроби!");
            break;
        }
        System.out.println("Кінець гри!");
    }

    }


