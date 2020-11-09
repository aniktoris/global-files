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
        String res;

        while (true) {
            while (!(sc.hasNext() && (res = sc.next()).matches(regex))) {
                view.printMessage(View.WRONG_INPUT);
            }
            return res;
        }
    }
    }
