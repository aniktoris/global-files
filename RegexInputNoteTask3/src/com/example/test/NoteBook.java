package com.example.test;

public class NoteBook {
    private String surname;
    private String nickname;
    private String phoneNumber;

    public NoteBook(String surname, String nickname, String phoneNumber)
                    throws NotUniqueNicknameException{
        if (DBNoteBook.checkNick(nickname)){
                throw new NotUniqueNicknameException ("Not Unique Nickname",
                        nickname);
        }
        this.surname = surname;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
