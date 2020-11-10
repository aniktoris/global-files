package com.example.test;

public class NotUniqueNicknameException extends Exception {
    private String nickname;

    public NotUniqueNicknameException(String message, String nickname) {
        super(message);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

}
