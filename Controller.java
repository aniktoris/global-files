package com.example.test;

import java.util.Scanner;

public class Controller {

    public String hello = "Hello";
    public String world = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputStringValueWithScanner(sc));
        model.addStringOurValue(hello, world);

        view.printMessageAndString(View.OUR_STRING, model.getValue());
    }

    public String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_FIRST_WORD);
        String firstWord;
        String secondWord;

        while (true) {
            firstWord = sc.nextLine();
            if (firstWord.equals(hello)) {
                view.printMessage(View.INPUT_SECOND_WORD);
                secondWord = sc.nextLine();
                if (secondWord.equals(world)) {
                    break;
                }
                view.printMessage(View.WRONG_STRING_DATA + View.INPUT_SECOND_WORD);
                sc.nextLine();
                return secondWord;
            }
            view.printMessage(View.WRONG_STRING_DATA + View.INPUT_FIRST_WORD);
        }
        return firstWord;


    }
}
