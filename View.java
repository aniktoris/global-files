package com.example.test;

public class View {

    public static final String INPUT_FIRST_WORD = "First word = ";
    public static final String INPUT_SECOND_WORD = "Second word = ";
    public static final String WRONG_STRING_DATA = "Wrong input! Please repeat!";
    public static final String OUR_STRING = "STRING value = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndString(String message, String value) {
        System.out.println(message + value);
    }

}
