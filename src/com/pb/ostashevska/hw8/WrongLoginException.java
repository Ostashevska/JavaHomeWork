package com.pb.ostashevska.hw8;

import sun.plugin2.message.Message;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String Message) {
        new Exception("Логін не відповідає вимогам");
    }
}



