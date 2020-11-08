package com.example.test;

import java.util.Scanner;

import static com.example.test.Regex_Container.*;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String surname;
    private String nickname;
    private String phoneNumber;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);

        this.surname =
                utilityController.inputStringValueWithScanner
                        (REGEX_SURNAME_LAT);

        this.nickname =
                utilityController.inputStringValueWithScanner
                        (REGEX_NICKNAME_LAT);

        this.phoneNumber =
                utilityController.inputStringValueWithScanner
                        (REGEX_PHONE_NUMBER);
    }
}
