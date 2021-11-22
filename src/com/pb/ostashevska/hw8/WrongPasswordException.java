package com.pb.ostashevska.hw8;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }
    public WrongPasswordException(String Message) {
        new Exception("Пароль не відповідає вимогам");
    }
}
