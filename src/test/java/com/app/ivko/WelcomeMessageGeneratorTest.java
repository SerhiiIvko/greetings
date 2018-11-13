package com.app.ivko;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Locale;

public class WelcomeMessageGeneratorTest {
    private WelcomeMessageGenerator welcomeMessage;
    private Locale locale;

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMorningTimeStarted() throws ParseException {
        //GIVEN:
        String time = "06:00:00";
        String expectedMessage = "Good morning, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMiddleOfMorning() throws ParseException {
        //GIVEN:
        String time = "08:30:00";
        String expectedMessage = "Good morning, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMorningTimeEnded() throws ParseException {
        //GIVEN:
        String time = "08:59:59";
        String expectedMessage = "Good morning, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenDayTimeStarted() throws ParseException {
        //GIVEN:
        String time = "09:00:00";
        String expectedMessage = "Good day, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMiddleOfDay() throws ParseException {
        //GIVEN:
        String time = "14:00:00";
        String expectedMessage = "Good day, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenDayTimeEnded() throws ParseException {
        //GIVEN:
        String time = "18:59:59";
        String expectedMessage = "Good day, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenEveningTimeStarted() throws ParseException {
        //GIVEN:
        String time = "19:00:00";
        String expectedMessage = "Good evening, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMiddleOfEvening() throws ParseException {
        //GIVEN:
        String time = "21:00:00";
        String expectedMessage = "Good evening, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenEveningTimeEnded() throws ParseException {
        //GIVEN:
        String time = "22:59:59";
        String expectedMessage = "Good evening, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenNightTimeStarted() throws ParseException {
        //GIVEN:
        String time = "23:00:00";
        String expectedMessage = "Good night, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenMiddleOfNight() throws ParseException {
        //GIVEN:
        String time = "02:30:00";
        String expectedMessage = "Good night, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenNightTimeEnded() throws ParseException {
        //GIVEN:
        String time = "05:59:59";
        String expectedMessage = "Good night, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMorningTimeStarted() throws ParseException {
        //GIVEN:
        String time = "06:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0435 "
                + "\u0443\u0442\u0440\u043e"
                + "\u002C \u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMiddleOfMorning() throws ParseException {
        //GIVEN:
        String time = "08:30:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0435 "
                + "\u0443\u0442\u0440\u043e"
                + "\u002C \u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMorningTimeEnded() throws ParseException {
        //GIVEN:
        String time = "08:59:59";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0435 "
                + "\u0443\u0442\u0440\u043e"
                + "\u002C \u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenDayTimeStarted() throws ParseException {
        //GIVEN:
        String time = "09:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0434\u0435\u043d\u044c\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMiddleOfDay() throws ParseException {
        //GIVEN:
        String time = "14:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0434\u0435\u043d\u044c\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenDayTimeEnded() throws ParseException {
        //GIVEN:
        String time = "18:59:59";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0434\u0435\u043d\u044c\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenEveningTimeStarted() throws ParseException {
        //GIVEN:
        String time = "19:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0432\u0435\u0447\u0435\u0440\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMiddleOfEvening() throws ParseException {
        //GIVEN:
        String time = "21:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0432\u0435\u0447\u0435\u0440\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenEveningTimeEnded() throws ParseException {
        //GIVEN:
        String time = "22:59:59";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u044b\u0439 "
                + "\u0432\u0435\u0447\u0435\u0440\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenNightTimeStarted() throws ParseException {
        //GIVEN:
        String time = "23:00:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0439 "
                + "\u043d\u043e\u0447\u0438\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenMiddleOfNight() throws ParseException {
        //GIVEN:
        String time = "02:30:00";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0439 "
                + "\u043d\u043e\u0447\u0438\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsRUAndWhenNightTimeEnded() throws ParseException {
        //GIVEN:
        String time = "05:59:59";
        String expectedMessage = "\u0414\u043e\u0431\u0440\u043e\u0439 "
                + "\u043d\u043e\u0447\u0438\u002C "
                + "\u041c\u0438\u0440\u0021";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.getDefault();

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getWelcomeMessageWhenLocaleIsENAndWhenTimeIsWrong() throws ParseException {
        //GIVEN:
        String time = "06:59:59";
        String expectedMessage = "Good night, World!";
        String actualMessage;

        //WHEN:
        welcomeMessage = new WelcomeMessageGenerator(time);
        locale = Locale.UK;

        //THEN:
        actualMessage = welcomeMessage.getWelcomeMessage(locale);
        Assert.assertNotEquals(expectedMessage, actualMessage);
    }
}