package com.company;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Login vveden nekorrektno");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
