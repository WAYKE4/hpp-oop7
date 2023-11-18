package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Information {

    public static boolean inputInformation(String login, String password, String confirmPassword) {
        Pattern patternLogin = Pattern.compile("[^ ]{1,20}");
        Pattern patternPassword = Pattern.compile("^(?=.*\\d)(?!.*\\s)(.{0,19})$");

        Matcher matcherLogin = patternLogin.matcher(login);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (!matcherLogin.matches()) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println(e);
            }
            return false;
        }

        if (!matcherPassword.matches()) {
            try {
                throw new WrongPasswordException("Ne pravil'no vveden parol' , registraciya ne vozmojna");
            } catch (WrongPasswordException e) {
                System.out.println(e);
            }
            return false;
        }

        if (confirmPassword != password) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                System.out.println("Ne pravil'no podtverden parol'");
            }
            return false;
        }
        System.out.println("Registraciya proshla yspeshna!");
        return true;
    }
}
