package com.pb.ostashevska.hw10;

public class Main {

    public static void main(String[] args) throws Exception {
      /* NumBox<Float> num1= new NumBox<>(5);
       num1.add(0, 2F);
        num1.add(1, 2.5F);
        num1.add(2, 5F);
        num1.add(3, 8F);
        num1.add(4, 7.1F);

        num1.sum ();
        num1.average();
        num1.length ();
        num1.get(3);
        num1.max();*/

        NumBox<Integer> num2= new NumBox<>(5);
        num2.add(0, 2);
        num2.add(1, (int) 2.5);
        num2.add(2, 5);
        num2.add(3, 8);
        num2.add(4, (int) 7.1);

        num2.sum ();
        num2.average();
        num2.length ();
        num2.get(3);
        num2.max();

    }
}
