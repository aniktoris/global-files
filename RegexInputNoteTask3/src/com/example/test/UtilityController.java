package com.example.test;

import java.util.Scanner;

public class UtilityController {
    private Scanner sc;
    private View view;

    public UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    public String inputStringValueWithScanner(String regex) {
        String yourInputSurname;
        String yourInputNickname;
        String yourInputPhoneNum;

        view.printMessage(View.INPUT_SURNAME);

        while (true) {
            while( !(sc.hasNext() && (yourInputSurname = sc.next()).matches(regex))) {
                view.printMessage(View.WRONG_INPUT);
            }

            if((yourInputSurname = sc.next()).matches(regex)) {
                view.printMessage(View.INPUT_NICKNAME);
                if ((yourInputNickname = sc.next()).matches(regex)) {
                    view.printMessage(View.INPUT_PHONE_NUMBER);

                }
            }
        }
        return yourInputSurname;
    }
    }
