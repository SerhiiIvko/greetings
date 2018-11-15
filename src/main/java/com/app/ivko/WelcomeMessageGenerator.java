package com.app.ivko;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class WelcomeMessageGenerator {
    private static final Logger log = Logger.getLogger(String.valueOf(WelcomeMessageGenerator.class));
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Date currentDate;
    private ResourceBundle resourceBundle;

    public WelcomeMessageGenerator() {
        currentDate = new Date();
    }

    public WelcomeMessageGenerator(String expectedTime) throws ParseException {
        currentDate = dateFormat.parse(expectedTime);
    }

    String getWelcomeMessage(Locale locale) {
        TimeContainer timeContainer = new TimeContainer();
        resourceBundle = ResourceBundle.getBundle("message", locale);
        String sentencePattern = resourceBundle.getString("delimiter")
                + resourceBundle.getString("world_message")
                + resourceBundle.getString("end_message");
        String greeting = null;
        try {
            FileHandler handler = new FileHandler("myLogFile" + ".log", true);
            log.addHandler(handler);
            greeting = getGreetingPattern(timeContainer) + sentencePattern;
            log.info(greeting);
            handler.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return greeting;
    }

    private String getGreetingPattern(TimeContainer timeContainer) throws ParseException {
        if (dateFormat.parse(dateFormat.format(currentDate)).after(dateFormat.parse(timeContainer.getMORNING_TIME()))
                && dateFormat.parse(dateFormat.format(currentDate)).before(dateFormat.parse(timeContainer.getDAY_TIME()))
                || dateFormat.parse(dateFormat.format(currentDate)).equals(dateFormat.parse(timeContainer.getMORNING_TIME()))) {
            return resourceBundle.getString("morning");
        } else if (dateFormat.parse(dateFormat.format(currentDate)).after(dateFormat.parse(timeContainer.getDAY_TIME()))
                && dateFormat.parse(dateFormat.format(currentDate)).before(dateFormat.parse(timeContainer.getEVENING_TIME()))
                || dateFormat.parse(dateFormat.format(currentDate)).equals(dateFormat.parse(timeContainer.getDAY_TIME()))) {
            return resourceBundle.getString("day");
        } else if (dateFormat.parse(dateFormat.format(currentDate)).after(dateFormat.parse(timeContainer.getEVENING_TIME()))
                && dateFormat.parse(dateFormat.format(currentDate)).before(dateFormat.parse(timeContainer.getNIGHT_TIME()))
                || dateFormat.parse(dateFormat.format(currentDate)).equals(dateFormat.parse(timeContainer.getEVENING_TIME()))) {
            return resourceBundle.getString("evening");
        } else {
            return resourceBundle.getString("night");
        }
    }
}