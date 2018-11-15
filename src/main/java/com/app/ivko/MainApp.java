package com.app.ivko;

import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        WelcomeMessageGenerator generator = new WelcomeMessageGenerator();
        System.out.println(generator.getWelcomeMessage(locale));
    }
}