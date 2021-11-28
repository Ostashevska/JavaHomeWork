package com.pb.ostashevska.hw8;

import org.jetbrains.annotations.NotNull;

public class Auth {
    public String login = "admin";
    public String password = "Pa55w0rd";


    /*public void signUp(@NotNull String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

            if (login.matches("[a-zA-Z0-9_],{5,20}")) {
                this.login = login;
            } else {
                System.out.println("Логін не відповідає вимогам: логін може містити лише латинські літери та цифри");
                throw new WrongLoginException();
            }

            if (password.matches("[a-zA-Z0-9_],{5, }") && password ==confirmPassword) {
                this.password = password;
            } else {
                System.out.println("Пароль не відповідає вимогам: може містити лише латинські літери, цифри та символ підкреслення");
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
}*/

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || !login.matches("[a-zA-Z0-9]{5,20}")) {
            throw new WrongLoginException("Login length must be between 5 and 20 symbols, contains only letters and numbers");
        }
        if (password == null || !password.matches("[a-zA-Z0-9_]{5,}")) {
            throw new WrongPasswordException("Password length must be >= 5 symbols, contains only letters, numbers and symbol \"_\"");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password not confirmed");
        }
        this.login = login;
        this.password = password;
    }

    /**
     * Login as registered user
     */
    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login)) {
            throw new WrongLoginException("User not found");
        }
        if (!this.password.equals(password)) {
            throw new WrongLoginException("User not found");
        }
    }
}
