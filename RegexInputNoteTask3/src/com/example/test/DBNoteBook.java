package com.example.test;

public enum DBNoteBook {
    NOTE_ONE("Korol", "smeshnaya11", "050-678-45-89"),
    NOTE_TWO("Bobko", "curly123", "067-678-45-89"),
    NOTE_THREE("Lobko", "blonde13", "068-678-45-89");

    private final String surname;
    private final String nick;
    private final String phoneNumber;

    DBNoteBook(String surname, String nick, String phoneNumber) {
        this.surname = surname;
        this.nick = nick;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static boolean checkNick (String nickname) {
        for (DBNoteBook note : DBNoteBook.values()) {
            if (note.getNick().equals(nickname)) {
                return true;
            }
        }
        return false;
    }
}
