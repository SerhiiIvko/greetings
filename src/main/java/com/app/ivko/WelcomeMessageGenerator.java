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
    private FileHandler handler;

    public WelcomeMessageGenerator() {
        currentDate = new Date();
    }

    public WelcomeMessageGenerator(String expectedTime) throws ParseException {
        currentDate = dateFormat.parse(expectedTime);
    }

    String getWelcomeMessage(Locale locale) throws ParseException {
        Date currentTime = dateFormat.parse(dateFormat.format(currentDate));
        Date morningTime = dateFormat.parse(TimeOfDay.MORNING.toString());
        Date dayTime = dateFormat.parse(TimeOfDay.DAY.toString());
        Date eveningTime = dateFormat.parse(TimeOfDay.EVENING.toString());
        Date nightTime = dateFormat.parse(TimeOfDay.NIGHT.toString());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        String resourceMessage;
        try {
            handler = new FileHandler("myLogFile" + ".log");
            log.addHandler(handler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (currentTime.after(morningTime) && currentTime.before(dayTime) || currentTime.equals(morningTime)) {
            resourceMessage = resourceBundle.getString("morning")
                    + resourceBundle.getString("delimiter")
                    + resourceBundle.getString("world_message")
                    + resourceBundle.getString("end_message");
            log.info(resourceMessage);
            log.addHandler(handler);
            handler.close();
            return resourceMessage;
        } else if (currentTime.after(dayTime) && currentTime.before(eveningTime) || currentTime.equals(dayTime)) {
            resourceMessage = resourceBundle.getString("day")
                    + resourceBundle.getString("delimiter")
                    + resourceBundle.getString("world_message")
                    + resourceBundle.getString("end_message");
            log.info(resourceMessage);
            log.addHandler(handler);
            handler.close();
            return resourceMessage;
        } else if (currentTime.after(eveningTime) && currentTime.before(nightTime) || currentTime.equals(eveningTime)) {
            resourceMessage = resourceBundle.getString("evening")
                    + resourceBundle.getString("delimiter")
                    + resourceBundle.getString("world_message")
                    + resourceBundle.getString("end_message");
            log.info(resourceMessage);
            log.addHandler(handler);
            handler.close();
            return resourceMessage;
        } else
            resourceMessage = resourceBundle.getString("night")
                    + resourceBundle.getString("delimiter")
                    + resourceBundle.getString("world_message")
                    + resourceBundle.getString("end_message");
        log.info(resourceMessage);
        log.addHandler(handler);
        handler.close();
        return resourceMessage;
    }
}