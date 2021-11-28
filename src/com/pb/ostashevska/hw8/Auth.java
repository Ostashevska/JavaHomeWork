package com.pb.ostashevska.hw8;

import org.jetbrains.annotations.NotNull;

public class Auth {
    public String login = "admin";
    public String password = "Pa55w0rd";


    public void signUp(@NotNull String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() < 20 && login.length() > 5) {
            if (!login.matches("[a-zA-Z0-9_]")) {
                System.out.println("Логін не відповідає вимогам: логін може містити лише латинські літери та цифри");
                throw new WrongLoginException();
            } else {
                this.login = login;
            }
        } else {
            System.out.println("Логін не відповідає вимогам: довжина логіну повинна бути більше 5-ти та менше 20-ти символів");
            throw new WrongLoginException();
        }

        if (password.length() > 5) {
            if (password.matches("[a-zA-Z0-9_]") && password ==confirmPassword) {
                this.password = password;
            } else {
                System.out.println("Пароль не відповідає вимогам: може містити лише латинські літери, цифри та символ підкреслення");
                throw new WrongPasswordException();
            }
        } else {
            System.out.println("Пароль не відповідає вимогам: довжина паролю повинна бути більше 5-ти символів");
            throw new WrongPasswordException();
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {

        if (this.login == login) {
            System.out.println("Успішний вхід");
        } else {
            System.out.println("Невірний логін");
            throw new WrongLoginException();
        }
    }
}
