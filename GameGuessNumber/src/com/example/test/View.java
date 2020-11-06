package com.example.test;

public class View {
    public static final String GUESS_NUMBER = "Please guess the number. Your attempt = ";
    public static final String WRONG_NUMBER = "Wrong input! Repeat please! ";
    public static final String LESS_THAN_GUESSED_NUMBER = "Now try BIGGER number than that!";
    public static final String MORE_THAN_GUESSED_NUMBER = "Now try SMALLER number than that!";
    public static final String CORRECT_NUMBER = "Congrats! You guessed the number! = ";
    public static final String GUESSED_NUMBERS = "Your guessed numbers = ";

    public void printMessage(String message) {
        System.out.println(message);
    }
}
