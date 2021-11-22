package com.pb.ostashevska.hw8;
import java.util.Scanner;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {

        Auth auth = new Auth();

        System.out.println("Пройдіть реєстрацію на сайті "+"\n Введіть логін: ");
        Scanner in = new Scanner(System.in);
        String login = in.next();

        System.out.println("Введіть пароль: ");
        Scanner in1 = new Scanner(System.in);
        String password = in1.next();

        System.out.println("Повторіть пароль: ");
        Scanner in2 = new Scanner(System.in);
        String confirmPassword = in2.next();

        try {
           auth.signUp(login, password,confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e1) {
            e1.printStackTrace();
        }
        finally {

        }


        System.out.println("Увійдіть на сайт: " + "\n Введіть логін: ");
        Scanner log = new Scanner(System.in);
        String loginIn = log.next();

        System.out.println("Введіть пароль: ");
        Scanner pas = new Scanner(System.in);
        String passwordIn = pas.next();

        try {
            auth.signIn(login, password);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
