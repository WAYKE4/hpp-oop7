package com.company;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Password vveden nekorrektno");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
