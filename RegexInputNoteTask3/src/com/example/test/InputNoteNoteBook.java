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

        view.printMessage(View.INPUT_SURNAME);
        this.surname =
                utilityController.inputStringValueWithScanner
                        (REGEX_SURNAME_LAT);

        view.printMessage(View.INPUT_NICKNAME);
        this.nickname =
                utilityController.inputStringValueWithScanner
                        (REGEX_NICKNAME_LAT);

        view.printMessage(View.INPUT_PHONE_NUMBER);
        this.phoneNumber =
                utilityController.inputStringValueWithScanner
                        (REGEX_PHONE_NUMBER);
    }
}
