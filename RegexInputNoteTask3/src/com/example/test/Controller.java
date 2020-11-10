package com.example.test;

import java.util.Scanner;

public class Controller implements Regex_Container {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

        NoteBook noteBook = getNoteBook(inputNoteNoteBook);
        System.out.println(noteBook);
    }

    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNoteBook) {
        NoteBook noteBook = null;
        while (true) {
            try {
                noteBook = new NoteBook(inputNoteNoteBook.getSurname(),
                        inputNoteNoteBook.getNickname(),
                        inputNoteNoteBook.getPhoneNumber());
                break;
            } catch (NotUniqueNicknameException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getNickname());
                inputNoteNoteBook.inputNick();
            }
        }
        return noteBook;
    }
}
