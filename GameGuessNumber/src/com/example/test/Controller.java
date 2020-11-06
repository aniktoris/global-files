package com.example.test;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setBoundaries(ConstantsMinMax.PRIMARY_MIN_BARRIER,
                            ConstantsMinMax.PRIMARY_MAX_BARRIER);

        model.setValue();
        System.out.println(model.getRightValue());

        while (model.checkValue(inputIntValueWithScanner(sc)));

        view.printMessage(View.CORRECT_NUMBER);
        view.printMessage(View.GUESSED_NUMBERS);
        System.out.println(model.getGuessedNumbers().toString());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        int guessedNumber = 0;
        view.printMessage(View.GUESS_NUMBER);

        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_NUMBER + View.GUESS_NUMBER);
                sc.next();
            }
            // check yourNumber in diapason
            if (((guessedNumber = sc.nextInt()) <= model.getMin()) ||
                    (guessedNumber < model.getRightValue())) {
                view.printMessage(View.WRONG_NUMBER + View.LESS_THAN_GUESSED_NUMBER);
            } else {
                view.printMessage(View.WRONG_NUMBER + View.MORE_THAN_GUESSED_NUMBER);
            }
            break;
        }
        return guessedNumber;
        }
    }



