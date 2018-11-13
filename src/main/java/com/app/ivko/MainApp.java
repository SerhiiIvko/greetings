package com.app.ivko;

import java.text.ParseException;
import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
//        Locale locale = Locale.UK;
        Locale locale = Locale.getDefault();
        try {
            System.out.println(new WelcomeMessageGenerator().getWelcomeMessage(locale));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}